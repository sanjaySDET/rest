package CurdOperations;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in/";
		when().delete("api/users/2")
		.then().log().all().assertThat().statusCode(204);
	}
}