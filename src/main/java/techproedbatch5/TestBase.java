package techproedbatch5;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.apache.http.client.methods.RequestBuilder;
import org.junit.Before;

public class TestBase {

    protected RequestSpecification spec01; //child larin hepsi kullanabilsin diye protected yaptik
    protected RequestSpecification spec02;
    protected RequestSpecification spec03;
    @Before
    public void setUp01(){
        spec01=new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com").
                build();
        // uri olusturduk ve spec01 icerisine depolanir kod tekrarindan kurtulma ve guncellemeleri haha hizli yapmak
    }
    @Before
    public void setUp02(){
        spec02=new RequestSpecBuilder().
                setBaseUri("http://dummy.restapiexample.com/api/v1/employees").
                build();
    }
    @Before
    public void setUp03(){
        spec03=new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com/todos").
                build();
    }
}
