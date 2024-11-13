package requestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import complexPostRequest.PojoClass;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddEmployeeToProject {
	@Test
	public void addEmpployee() {
		int rn = new Random().nextInt(5000);
		
		// API to add project
		PojoClass p = new PojoClass("Professor", "Heist6"+rn, "Created", 0);
		
		Response r  = given().contentType(ContentType.JSON).body(p)
		.when().post("http://49.249.28.218:8091/addProject");
		r.then().assertThat().statusCode(201).log().all();
		
		//Capture project name from response
		String projectName = r.jsonPath().getString("projectName");
		System.out.println("Project ID is  ---------" +  projectName);
		
		EmployeePOJO  e = new EmployeePOJO("Hunter" ,"15/08/2000","professor@mh.com",
							"tokyo"+rn , 4.2 , "9876543210" ,projectName , "Role_Employee" ,"tokyo"+rn);
		
				
		given().contentType(ContentType.JSON).body(e)
		.when().post("http://49.249.28.218:8091/employees")
		.then().log().all();
		
		String ename = r.jsonPath().getString("username");
		
		
		
		
		
		
		
		
		
	}
}
