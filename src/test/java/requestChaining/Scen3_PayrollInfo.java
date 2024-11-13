package requestChaining;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Scen3_PayrollInfo {
	
	@Test
	public void demo() {
		
		//API - 1 get auth API
		given()
			.formParam(" ", "")
		.when().post("http://49.249.28.218:8091/login")
		.then().log().all();
		
		// API - 2 payroll info
//		Response r  = given().get("http://49.249.28.218:8091/admin/payrolls");
//				r.then().log().all();
//		
	}
}
