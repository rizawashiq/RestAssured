package practiceResponseValidation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.response.Response;

public class VerifyDataFromComplexXpath {
	
	@Test
	public void sampleTest() {
		Response resp =  given().get("http://49.249.28.218:8091/projects-paginated");
//		resp.then().log().all();
		
		ArrayList<String> al = JsonPath.read(resp.asString(), "content[*]['projectId' ,'projectName'] ");
		System.out.println(al);
//		for(String x :al )
//		{
//			System.out.println(x);
//		}
		System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-");
		ArrayList<String> al2 = JsonPath.read(resp.asString(), "content[*].projectName");
		ArrayList<String> al3 = JsonPath.read(resp.asString(), "content[*].createdBy");
		for(int i=0 ;i<al.size();i++)
		{
			System.out.println(al2.get(i) + " " + al3.get(i) );
		}
		
		System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-");
		al = JsonPath.read(resp.asString(), "content[*].[?(@.createdBy=='Suma' || @.createdBy=='Rohit')].projectName");
		System.out.println(al);
		
		
		// extract first project id
		// DB validation
		// request chain
		
		
		
		
		
		
		
	}
}
