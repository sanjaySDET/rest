package SpecBuilders;


import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CurdOperations {

	public static void main(String[] args) {
		RequestSpecification resquestSpec = new RequestSpecBuilder().setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();

		ResponseSpecification responseSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
	
		//getData
		given().log().all().spec(resquestSpec).when().get("api/users?page=2").then().log().all().spec(responseSpec).extract().response();
		
		//postData
		given().log().all().spec(resquestSpec).body("{\r\n"
				+ "    \"name\": \"shoba\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").when().post("api/users").then().log().all().spec(responseSpec).extract().response();
		
		//put
		given().log().all().spec(resquestSpec).body("{\r\n"
				+ "    \"name\": \"shoba\",\r\n"
				+ "    \"job\": \"teacher\"\r\n"
				+ "}").when().post("api/users/2").then().log().all().spec(responseSpec).extract().response();
		
		//patch
		given().log().all().spec(resquestSpec).body("{\r\n"
				+ "    \"name\": \"shoba\",\r\n"
				+ "    \"job\": \"lawyer\"\r\n"
				+ "}").when().post("api/users/2").then().log().all().spec(responseSpec).extract().response();
		
		//delete
		given().log().all().spec(resquestSpec).when().delete("api/users/2").then().log().all().spec(responseSpec).extract().response();
	}
}