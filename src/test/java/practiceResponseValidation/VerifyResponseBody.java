package practiceResponseValidation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class VerifyResponseBody {

	@Test
	public void verifyBody() {
		Response resp =  given().get("http://49.249.28.218:8091/projects-paginated");
		resp.then().log().all();
		
		resp.then().assertThat().body("numberOfElements", Matchers.greaterThanOrEqualTo(20));
		//			or
		int data = resp.jsonPath().get("numberOfElements");
		System.out.println(data);
		
		
		resp.then().assertThat().body("pageable.sort.unsorted", Matchers.equalTo(true));
		//	or
		boolean data2 = resp.jsonPath().get("pageable.sort.unsorted");
		System.out.println(data2);
		
		
		resp.then().assertThat().body("content[0].projectId", Matchers.equalTo("NH_PROJ_950"));
		String data3 = resp.jsonPath().get("content[0].projectId");
		System.out.println(data3);
		
		
		ArrayList<String> al = resp.jsonPath().get("content.projectName");
		for(String x :al )
		{
			System.out.println(x);
		}
		
		
		
		
	}
}
