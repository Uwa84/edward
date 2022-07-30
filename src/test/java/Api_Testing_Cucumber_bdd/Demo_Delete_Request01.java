package Api_Testing_Cucumber_bdd;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;
import org.apache.poi.xwpf.usermodel.IBody;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Delete_Request01 {

           @Test
            public void deleteState(){
                RestAssured.baseURI="http//www.gmibank.com/api/tp-states/1803";
                RestAssured.basePath="/delete/\"1803";



                  RequestSpecification request= RestAssured.given()
                                .when()
                          .then()
                          .log().all().request();
                              Response response =request.delete("http//www.gmibank.com/api/tp-states/1803");

               int code= response.getStatusCode();
               String string=response.getStatusLine();
                String jsonAsString= response.asString();
                Assert.assertEquals(jsonAsString.contains("successfully! deleted Records"),true);






            }

        }







