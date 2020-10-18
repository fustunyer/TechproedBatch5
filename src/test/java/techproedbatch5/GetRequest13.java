package techproedbatch5;

import io.restassured.path.json.JsonPath;
import org.junit.Test;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class GetRequest13 extends TestBase{
    @Test
    public void get01(){
        Response response=given().
                spec(spec02).
                when().
                get();
        response.prettyPrint();
        JsonPath jsonPath=response.jsonPath();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(jsonPath.getString("data[0].employee_name"),"Tiger Nixon");
        softAssert.assertEquals(jsonPath.getString("data[1].employee_name"),"Garrett Winters");
        softAssert.assertEquals(jsonPath.getString("data[2].employee_name"),"Ashton Cox");
        softAssert.assertEquals(jsonPath.getString("data[3].employee_name"),"Cedric Kelly");
        softAssert.assertEquals(jsonPath.getString("data[4].employee_name"),"Airi Satou");

        List<String> isimList=new ArrayList<>();
        isimList.add("Tiger Nixon");
        isimList.add("Garrett Winters");
        isimList.add("Ashton Cox");
        isimList.add("Cedric Kelly");
        isimList.add("Airi Satou");

        for (int i=0;i<isimList.size();i++){
            softAssert.assertEquals(jsonPath.getString("data["+i+"].employee_name"),isimList.get(i));
        }
        List<Map> actualList=jsonPath.getList("data");
        System.out.println(actualList);
        Map<Integer,String > expectedMap=new HashMap<>();
        expectedMap.put(0,"Tiger Nixon");
        expectedMap.put(1,"Garrett Winters");
        expectedMap.put(2,"Ashton Cox");
        expectedMap.put(3,"Cedric Kelly");
        expectedMap.put(4,"Airi Satou");

        for (int i=0;i<expectedMap.size();i++){
            softAssert.assertEquals(actualList.get(i).get("employee_name"),expectedMap.get(i));
        }

        softAssert.assertAll();

    }






}
