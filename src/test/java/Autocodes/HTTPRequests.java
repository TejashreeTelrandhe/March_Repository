package Autocodes;
import org.testng.annotations.Test;
import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
//given()----> content type,set cookies,add auth, add param, set headers etc.....
//when()-----> Get, post, put, delete....
//then()-----> validate status code, extract response, extract headers cookies & response body

    public class HTTPRequests{
       @Test  (priority=1)
       void getUsers ()
       {
    	    given()    	
    	   .when ()
           .get("https://reqres.in/api/users?page=2")    	
    	   .then()
    	   .statusCode(200)
           .body("page",equalTo(2))
           .log().all();
       } 
//       @Test
//       void createUser()
//       {
//    	   given()
//    	   
//    	   .when()
//    	   
//    	   .then()
//       }
		
     }
