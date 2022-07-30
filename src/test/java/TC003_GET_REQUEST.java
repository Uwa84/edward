import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_GET_REQUEST {
    @Test
    public void googleMapTest(){
        //SPECIFY THE BASE URI
        RestAssured.baseURI="http://maps.googleapis.com";

        //CREATING REQUEST OBJECT
        RequestSpecification httpRequest=RestAssured.given();

        //CREATION RESPONSE OBECT
        Response response= httpRequest.request(Method.GET,"/http:/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&type=supermarket&key=AIzaSyBj");

        //How to print response ( although normally ıts not done)
        //Nornally the response is in json format but we need it in string form so we can use
        String responseBody=response.getBody().asString();
        System.out.println("Response Body is :"+ responseBody);


        //VALIDATING DETAILS OF HEADERS FROM RESPONSE

        String contentType=response.header("Content-type");//CAPTURE DETAILS OF CONTENT-TYPE HEADERS
        System.out.println("Content Type is:"+contentType);
        Assert.assertEquals(contentType, "application/xml;charset=UTF-8");

        String contentEncoding =response.header("content-Encoding ");//CAPTURE DETAILS OF CONTENT-ENCODING HEADERS
        System.out.println("content Encoding is:"+contentEncoding);
        Assert.assertEquals(contentEncoding, "gzip");

    }
}


