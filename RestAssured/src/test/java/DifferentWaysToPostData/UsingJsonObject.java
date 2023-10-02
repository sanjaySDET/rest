package DifferentWaysToPostData;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UsingJsonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject object = new JSONObject();
		object.put("Firstname", "shobha");
		object.put("Lastname", "rani");
		object.put("age", 27);
		object.put("email", "shobha123@gmail.com");
		
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().contentType(ContentType.JSON)
		.body(object)
		.when().post("api/users")
		.then().log().all().assertThat().statusCode(201).contentType(ContentType.JSON);
	}

}
