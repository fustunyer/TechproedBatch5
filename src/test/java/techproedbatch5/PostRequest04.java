package techproedbatch5;
import static io.restassured.RestAssured.*;

public class PostRequest04 extends TestBase {
     /*  POST Scenario:
               Content type Json olsun  (Content Type demektir.)
               When
               POST request yolladigimda
            1) https://restful-booker.herokuapp.com/booking
           2) Request Body
           {
               "firstname": "Hasan",
                 "lastname": "Kara",
                 "totalprice": 123,
                 "depositpaid": true,
                "bookingdates": {
               "checkin": "2020-05-02",
               "checkout": "2020-05-05"
           },
               "additionalneeds": "Wifi"
           }
           Then
           Status Code 200 olmali
           Response Body, Request Body ile ayni olduğunu verfy ediniz
           POJO=Plain Old Java Object
           POJO Json fomatindaki data yi classlara cevirme islemine denir
           http://www.jsonschema2pojo.org/ adresine gidilir.
           daha sonra data parantezler arasi kopyalanip siteye tasinir
           sol tarafta classname=booking
                        target=java
                        source type=json  olacak
              daha sonra preview ile classlar olusturulacak ve
              key lerin hepsi variable olarak tanimalanir

*/
}
