package parameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PathParametr {
	
	@Test
	public void demo() {
		given().
			pathParam("projectId", "NH_PROJ_5620")
		.when()
			.get("http://49.249.28.218:8091/project/{projectId}")
		.then().log().all();
	}
}
