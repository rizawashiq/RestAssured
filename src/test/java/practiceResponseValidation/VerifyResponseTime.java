package practiceResponseValidation;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class VerifyResponseTime {
	
	@Test
	public void verifyHeader() {
		Response resp =  given().get("http://49.249.28.218:8091/projects");
		resp.then().log().all();
		
		long timetaken = resp.time();
		long timeinsec = resp.timeIn(TimeUnit.SECONDS);
		System.out.println(timetaken);
		System.out.println(timeinsec);
		
		
		resp.then().assertThat().time(Matchers.lessThan(900L));
		
		resp.then().assertThat().time(Matchers.greaterThan(300L));
		
		resp.then().assertThat().time(Matchers.both(Matchers.lessThan(900L))
				.and(Matchers.greaterThan(300L)));
		
		
		
		
	}
}
