package com.sampleCrudWithBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class SampleTestForDelete {

	@Test
	public void getDataToServer() {
		given()
			.delete("http://49.249.28.218:8091/project/NH_PROJ_5505").
		then().assertThat().statusCode(204)
			.log().all();
		
		
		
	}
}
