package complexPostRequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class RequestViaHashMap {
	
	@Test
	public void postRequest() {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("createdBy", "Professor");
		map.put("projectName", "Heist4");
		map.put("status", "Created");
		map.put("teamSize", 0);
		
		given().contentType(ContentType.JSON).body(map)
		.when().post("http://49.249.28.218:8091/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}
}
