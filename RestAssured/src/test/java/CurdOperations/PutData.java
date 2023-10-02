package CurdOperations;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"shobha\",\r\n"
				+ "    \"job\": \"traineer\"\r\n"
				+ "}")
		.when().put("api/users/2")
		.then().log().all().assertThat().statusCode(200).contentType(ContentType.JSON);
	}
}