import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.StatusLine;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_GET_REQUEST {
    @Test
    public void getweatherDetails(){
        //SPECIFY THE BASE URI
        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/Hyderabad";

        //CREATING REQUEST OBJECT
        RequestSpecification httpRequest=RestAssured.given();

        //CREATION RESPONSE OBECT
        Response response= httpRequest.request(Method.GET,"/Hyderabad");

        //How to print response ( although normally ıts not done)
        //Nornally the response is in json format but we need it in string form so we can use
        String responseBody=response.getBody().asString();
         System.out.println("Response Body is :"+ responseBody);

         // how varify status code
        int statusCode=response.getStatusCode();
        System.out.println("status code is: "+"StatusCode");
        Assert.assertEquals(statusCode,200);

        // how varify status Line
        String statusLine=response.getStatusLine();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1  200 OK");

    }
}
