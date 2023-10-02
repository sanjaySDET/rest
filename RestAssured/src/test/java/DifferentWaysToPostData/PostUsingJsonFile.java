package DifferentWaysToPostData;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostUsingJsonFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./createData.json");
		
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().contentType(ContentType.JSON)
		.body(file)
		.when().post("api/users")
		.then().log().all().assertThat().statusCode(201).contentType(ContentType.JSON);
	}

}
