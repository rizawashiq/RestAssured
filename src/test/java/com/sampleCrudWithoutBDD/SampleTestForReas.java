package com.sampleCrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestForReas {
	
	@Test
	public void getDataFromServer() {
		Response rep =  RestAssured.get("http://49.249.28.218:8091/projects");
		rep.then().assertThat().statusCode(200);
//		System.out.println(rep.prettyPrint());
		rep.then().log().all();
		
	}
}
