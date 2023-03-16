package Autocodes;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.equalTo;
public class Test1 {

	public static void main(String[] args) {
		/*
		 * Validate if add place API is working as expected Given - All input details
		 * When - Submit the API - Resources and HTTP method Then - Validate the
		 * Response
		 */

		// Add Place

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String Response = given().queryParam("key", "qaclick").header("Content-Type", "application/json")
				.body("{\n" + "\"location\": {\n" + "\"lat\": -38.383494, \n" + "\"lng\": 33.427362\n" + "},\n"
						+ "\"accuracy\": 50,\n" + "\"name\": \"Velocity Classes\", \n"
						+ "\"phone_number\": \"(+91) 983 893 3937\", \n" + "\"address\": \"Katraj Pune\", \n"
						+ "\"types\": [\n" + "\"shoe park\",\"shop\" ],\n" + "\"website\": \"http://google.com\", \n"
						+ "\"language\": \"English-IN\"\n" + "   \n" + "}\n" + "")
				.when().post("maps/api/place/add/json").then().log().all().statusCode(200).body("scope", equalTo("APP"))
				.header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();

		System.out.println("Response Code --->" + Response);

		JsonPath Js = new JsonPath(Response);

		String Place_ID = Js.getString("place_id");

		System.out.println("Place ID -->" + Place_ID);
}
}