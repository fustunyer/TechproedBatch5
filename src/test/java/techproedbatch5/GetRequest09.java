package techproedbatch5;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.asserts.SoftAssert;


public class GetRequest09 extends TestBase{


    @Test
    public void get01(){
        Response response=given().
                spec(spec02).
                when().
                get();
       //response.prettyPrint();
        JsonPath jsonPath=response.jsonPath();
        //System.out.println(jsonPath.getString("data.employee_name"));
        System.out.println(jsonPath.getList("data.employee_name"));
        //2. ISCININ 'Garrett Winters' oldugunu 'verify' ediniz
        assertEquals("isim istendigi gibi degil","Garrett Winters",jsonPath.getString("data[1].employee_name"));

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(jsonPath.getString("data[1].employee_name"), "Garrett Winters",
                "isim istenilen gibi degil");

        //iscilein arasinda "Harrod Chandler" isminin var oldugunu 'verify' ediniz
        softAssert.assertTrue(jsonPath.getString("data.employee_name").contains("Herrod Chandler"),
                "bu isim mevcut degil");
        //24 iscinin oldugunu "verify" ediniz

        softAssert.assertEquals(jsonPath.getList("data.id").size(),24,"isci sayisi 24 degildir");
        //7. iscinin maasinin 137500 oldugunu "verify" ediniz
        softAssert.assertEquals(jsonPath.getString("data[6].employee_salary"),137500,"maas verilen degere esit degil");


        softAssert.assertAll();



    }
}
