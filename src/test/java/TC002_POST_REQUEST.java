import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.util.Password;

public class TC002_POST_REQUEST {
        @Test
        public void RegistrationSuccessful(){
            //SPECIFY THE BASE URI
            RestAssured.baseURI="http://restapi.demoqa.com/customer";

            //CREATING REQUEST OBJECT
            RequestSpecification httpRequest=RestAssured.given();

            //REQUEST PAYLOAD SENDING ALONG WITH POST REQUEST
            JSONObject requestParams=new JSONObject();

            requestParams.put("FirstName", "JohnZYXZ");
            requestParams.put("LastName", "JohnZYXdZ");
            requestParams.put("UserName", "JohnZYXeZ");
            requestParams.put("Password", "JohnZYXZlk");
            requestParams.put("Email", "JohnZYXZ@gmail.com");

            httpRequest.header("Content-Type","application/json");
            httpRequest.body(requestParams.toJSONString());// attach the above data to the request

            // RESPONSE OBJECT
            Response response=httpRequest.request(Method.POST,"register");






            //How to print response ( although normally ıts not done)
            //Nornally the response is in json format but we need it in string form so we can use
            String responseBody=response.getBody().asString();
            System.out.println("Response Body is :"+ responseBody);

            // how varify status code
            int statusCode=response.getStatusCode();
            System.out.println("status code is: "+"StatusCode");
            Assert.assertEquals(statusCode,201);

            String successCode=response.jsonPath().get("SuccessCode");
            Assert.assertEquals("SuccessCode",201);

            // how varify status Line
            String statusLine=response.getStatusLine();
            System.out.println(statusLine);
            Assert.assertEquals(statusLine, "HTTP/1.1  200 OK");

        }
    }

