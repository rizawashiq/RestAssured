package authorisation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class PreEmtiveAuth {
	@Test
	public void demo() {
		given()
			.auth().preemptive().basic("rmgyantra", "rmgy@9999").log().all()	
		.when()
			.get("http://49.249.29.5:8091/login")
		.then().log().all();
	}
}
