package CurdOperations;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"name\": \"shobha\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when().post("api/users")
		.then().log().all().assertThat().statusCode(201).contentType(ContentType.JSON);
	}

}
