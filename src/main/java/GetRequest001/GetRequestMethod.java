package GetRequest001;

//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
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;



public class GetRequestMethod {
    @Test(priority = 1)
    public void getRequest(){
        Response response=RestAssured.get("https://reqres.in/api/users?per_page=20");

         System.out.println(response.getStatusCode());
        System.out.println(response.jsonPath());
        System.out.println(response.getContentType());
         System.out.println(response.getBody().asString());



    }
    @Test(priority = 2)
    public void getRequest1(){
    RestAssured.baseURI="https://reqres.in/api/users?per_page=20";
    RequestSpecification request= RestAssured.given();
   request.param("per_page","2");
   request.header("Content-Type","application/json");
   request.get().then().assertThat().statusCode(200).log().all().toString();




}
}