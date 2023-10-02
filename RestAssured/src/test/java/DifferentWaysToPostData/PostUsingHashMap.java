package DifferentWaysToPostData;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostUsingHashMap {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("name", "shobha");
		map.put("job","traineer");
		map.put("age", 27);
		
		
		RestAssured.baseURI="https://reqres.in/";
		given().log().all().contentType(ContentType.JSON)
		.body(map)
		.when().post("api/users")
		.then().log().all().assertThat().statusCode(201).contentType(ContentType.JSON);
	}
}