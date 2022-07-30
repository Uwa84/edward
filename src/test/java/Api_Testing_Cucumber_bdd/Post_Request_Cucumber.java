package Api_Testing_Cucumber_bdd;

import CommonReuseableMethods.RestUtils;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class Post_Request_Cucumber {
    public static HashMap map=new HashMap();
    @BeforeClass
    public void postdata(){
        map.put("FirstName",RestUtils.getFirstName());
        map.put("LastName",RestUtils.getLastName());
        map.put("UserName",RestUtils.getUserName());
        map.put("Password",RestUtils.getPassword());
        map.put("Email",RestUtils.getEmail());

        RestAssured.baseURI="http://restapi.demoqa.com/customer";
        RestAssured.basePath="/register";

    }
    @Test
    public void testPost(){
        given()
                .contentType("application/json")
                .body(map)

                .when()
                .post()
                .then()
                .statusCode(201)
                .body("successCode",equalTo("OPERATION SUCCESS"))
                .body("Message",equalTo("Operation completed successfully"));



    }

}
