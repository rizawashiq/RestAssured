package encryptionDecryption;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class APIEncodeTest {
	
	@Test
	public void test() {
		given()
		.auth().preemptive().basic("rmgyantra", "rmgy@9999").log().all()	
	.when()
		.get("http://49.249.28.218:8091/projects")
	.then().log().all();
	}
}
