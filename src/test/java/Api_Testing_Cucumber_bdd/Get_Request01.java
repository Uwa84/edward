package Api_Testing_Cucumber_bdd;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

//IMPORTANT PROCEDURE
/*
given()
set cookies, and auth, add param, set headers info etc.......
when()
get,post,put,delete.....
then()
validate status code, extract response, extract headers cookies and response body.....
 */

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Get_Request01 {
/*
    @Test
    public void getWeatherDetails(){
        given()
                .when()
                .get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("city",equalTo("Hyderabad"))
                .header("Content-type","application/json");

    }
    */

     @Test
    public void authentication(){
        baseURI= "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
        RequestSpecification request=RestAssured.given()
                .auth().
                preemptive()
                .basic("edward","101");




        Response response= request.get();
        int code=response.getStatusCode();

    }

}
