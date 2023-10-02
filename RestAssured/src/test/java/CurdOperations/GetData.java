package CurdOperations;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetData {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		when().get("api/users?page=2")
		.then().log().all().statusCode(200).contentType(ContentType.JSON);
	}
}