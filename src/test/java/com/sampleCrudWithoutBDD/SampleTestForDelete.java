package com.sampleCrudWithoutBDD;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleTestForDelete {

	@Test
	public void getDataToServer() {
		
		Response resp =  RestAssured.delete("http://49.249.28.218:8091/project/NH_PROJ_5485");
		resp.then().log().all();
		resp.then().assertThat().statusCode(204);
		
		
	}
}
