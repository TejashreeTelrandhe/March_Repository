package API_automation;
import static org.hamcrest.Matchers.equalTo;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class API_methods {

	public static void main(String[] args) {
// Validate if add place API is working as expected

//	Given : All input details
//	When : Submit the API - resources and http methods
//  Then : Validate response
//		Given():‘Given’ keyword, lets you set a background, here, you pass the request headers,
//		query and path param, body, cookies. This is optional if these items are not needed in the request.
//		When() :‘when’ keyword marks the premise of your scenario. For example, ‘when’ you get/post/put something,
//		do something else.
//		Method():Substitute this with any of the CRUD operations(get/post/put/delete)
//		Then():Your assert and matcher conditions go here

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String Response = given().queryParam("key", "qaclick").header("Content-Type", "application/json")
				.body("{\n" + "\"location\": {\n" + "\"lat\": -38.383494, \n" + "\"lng\": 33.427362\n" + "},\n"
						+ "\"accuracy\": 50,\n" + "\"name\": \"Velocity Classes\", \n"
						+ "\"phone_number\": \"(+91) 983 893 3937\", \n" + "\"address\": \"Katraj Pune\", \n"
						+ "\"types\": [\n" + "\"shoe park\",\"shop\" ],\n" + "\"website\": \"http://google.com\", \n"
						+ "\"language\": \"English-IN\"\n" + "   \n" + "}\n" + "")
				.when().post("maps/api/place/add/json").then().log().all().statusCode(200).body("scope", equalTo("APP"))
				.header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();

		System.out.println("Response code ---> "+Response);
		
		JsonPath JS = new JsonPath(Response);
		String Place_ID= JS.getString("place_id");
		System.out.println("Place_ID --->"+Place_ID);
	}

}
