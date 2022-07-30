package Api_Testing_Cucumber_bdd;

import CommonReuseableMethods.RestUtils;
import io.restassured.RestAssured;
import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;
import org.json.simple.JSONObject;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Put_Request_Api {

@Test
    public void put(){

    RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
    RestAssured.basePath="/update/";

    JSONObject object= new JSONObject();
    object.put("name","empName");
    object.put("salary","empSalary");
    object.put("age","empAge");
    RestAssured.given().delete().then().statusCode(301).log().all();


     }


}
