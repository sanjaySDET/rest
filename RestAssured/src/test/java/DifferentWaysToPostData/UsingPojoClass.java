package DifferentWaysToPostData;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojoClasses.ProjectLibrary;

public class UsingPojoClass {

	public static void main(String[] args) {
		
		ProjectLibrary lib = new ProjectLibrary("Shobha", "Rani", 27, "shobha123@gmail.com");

		RestAssured.baseURI="https://reqres.in/";
		given().log().all().contentType(ContentType.JSON)
		.body(lib)
		.when().post("api/users")
		.then().log().all().assertThat().statusCode(201).contentType(ContentType.JSON);
	}

}
