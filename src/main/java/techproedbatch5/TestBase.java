package techproedbatch5;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.apache.http.client.methods.RequestBuilder;
import org.junit.Before;

public class TestBase {

    protected RequestSpecification spec01; //child larin hepsi kullanabilsin diye protected yaptik
    @Before
    public void setUp01(){
        spec01=new RequestSpecBuilder().
                setBaseUri("  https://restful-booker.herokuapp.com").
                build();
        // uri olusturduk ve spec01 icerisine depolanir kod tekrarindan kurtulma ve guncellemeleri haha hizli yapmak
    }



}
