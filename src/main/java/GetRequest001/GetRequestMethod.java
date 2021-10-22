package GetRequest001;

//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
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;



public class GetRequestMethod {
    @Test
    public void getRequest(){
        Response response=RestAssured.get("https://reqres.in/api/users?per_page=20");

         System.out.println(response.getStatusCode());
        System.out.println(response.jsonPath());
        System.out.println(response.getContentType());
         System.out.println(response.getBody().asString());





    }
}
