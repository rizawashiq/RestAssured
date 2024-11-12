package complexPostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RequestViaJsonRequest {
	
	@Test
	public void requestviaJson() {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Professor");
		jobj.put("projectName", "Heist3");
		jobj.put("status", "Created");
		jobj.put("teamSize", 0);
		
		given().contentType(ContentType.JSON)
			.body(jobj.toJSONString())
		.when().post("http://49.249.28.218:8091/addProject")
		.then().assertThat().statusCode(201).log().all();
	}
}
