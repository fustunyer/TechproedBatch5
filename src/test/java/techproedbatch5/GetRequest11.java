package techproedbatch5;

import io.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class GetRequest11 extends TestBase{
//GSON 1)Json turundeki datalari Java objectleriine donusturur (De serilization)
    //2)Java objectlerini Gson formatina cevirir (Serialization)

//    Json-->GSON -->Java(`Maplere veya listlere cevirilir)(De serilization)
//     Java-->GSON-->Json

    @Test
    public void get01(){
        Response  response=given().
                    spec(spec03).
                    when().
                    get("/2");
        response.prettyPrint();
        HashMap<String ,String>  map=response.as(HashMap.class);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(map.get("completed"),false,"false degerinde degil");
        softAssert.assertEquals(map.get("userId"),1.0,"user id uyusmuyor");
        softAssert.assertEquals(map.get("id"),2.0,"id uyusmuyor");
        softAssert.assertEquals(map.get("title"),"quis ut nam facilis et officia qui","title uyusmuyor");
        softAssert.assertAll();

    }

}

