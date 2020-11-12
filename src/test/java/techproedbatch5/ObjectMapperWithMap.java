package techproedbatch5;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.groovy.control.io.ReaderSource;
import org.json.JSONObject;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertTrue;


public class ObjectMapperWithMap extends TestBase{

    @Test
    public void javaToJson(){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(101,"Ali");
        map.put(102,"Veli");
        map.put(103,"Can");
    }
}
