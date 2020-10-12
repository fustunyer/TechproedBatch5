package excercises;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;


import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class Q1 {
    /*
    test altındaki java klasoru altina Excercises ismi ile bir package oluturun.
    Bu package altine Q1 isimli class oluturun ve asagidaki istenilen Test Case yaziniz.
     Positive Scenario:
     When Asagidaki Endpoint'e bir GET request yollayalim
     https://restful-booker.herokuapp.com/booking/2
     And Accept type “application/json” mi?
     Then
     HTTP Status Code 200
     And Response format "application/json"
     And firstname "Mark"
     And lastname "Brawn"
     And checkin date "2017-12-30"
     And checkout date "2019-01-12"
*/
    @Test
    public void get01(){
        Response response=given().accept("application/JSON").
                when().
                get("     https://restful-booker.herokuapp.com/booking/2");

        response.prettyPrint();

        response.
                then().
                statusCode(200).
                contentType("application/JSON").
                body("fistname", Matchers.equalTo("Susan"),
                        "lastname",Matchers.equalTo("Jones"),
                        "bookingdates.checkin",Matchers.equalTo("2019-07-05"),
                        "bookingdates.checkout",Matchers.equalTo("2019-09-16"));

    }
}
