package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import complexPostRequest.PojoClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scen_1_delete_Project {
	@Test
	public void postRequest() {
		int rn = new Random().nextInt(5000);
		
		// API to add project
		PojoClass p = new PojoClass("Professor", "Heist6"+rn, "Created", 0);
		
		Response r  = given().contentType(ContentType.JSON).body(p)
		.when().post("http://49.249.28.218:8091/addProject");
		r.then().assertThat().statusCode(201).log().all();
		
		//Capture project name from response
		String projectId = r.jsonPath().getString("projectId");
		System.out.println("Project ID is  ---------" +  projectId);
		
		//Deleting the project
		given().delete("http://49.249.28.218:8091/project/"+projectId)
		.then().log().all();
		
	}
}













