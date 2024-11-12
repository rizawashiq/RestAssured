package practiceResponseValidation;

//import static io.restassured.response.Response.*;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class VerifyResponseHeaderTest {
	
	@org.testng.annotations.Test
	public void verifyHeader() {
		Response resp =  given().get("http://49.249.28.218:8091/projects");
		resp.then().log().all();
		
		resp.then().assertThat().contentType(ContentType.JSON);
		
		resp.then().assertThat().statusCode(200);
		
		resp.then().assertThat().statusLine("HTTP/1.1 200 ");
		
		resp.then().assertThat().header("Transfer-Encoding", "chunked");
			
	}
}
