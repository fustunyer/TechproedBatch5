package techproedbatch5;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.groovy.control.io.ReaderSource;
import org.json.JSONObject;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import static org.junit.Assert.assertEquals;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertTrue;


public class DeleteRequest01 extends TestBase{
    //Sadece end point gerekli
    @Test
    public void delete01(){
        Response responseGet=given().
                spec(spec03).
                when().
                get("/198");
        responseGet.prettyPrint();
        //delete islemi
        Response responseDel =given().
                spec(spec03).
                when().
                delete("/198");
        responseDel.prettyPrint();
        //responseDel yazdirildiginda  "Not Found" cevabi gelirse  status code 404 ile test edilir. Eger bos bir
        // satir donerse Ststus code 200 ile test edilir.
        responseDel.then().assertThat().statusCode(200);
        // Hard assert
        assertTrue(responseDel.getBody().asString().contains(""));
        //softAssertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(responseDel.getBody().asString().contains(""));
        softAssert.assertAll();


    }




}
