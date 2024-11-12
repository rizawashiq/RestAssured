package com.sampleCrudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForPatch {

	@Test
	public void patchDataToServer() {
		JSONObject jobj = new JSONObject();
		jobj.put("projectName", "Rio");
		
		given()
			.contentType(ContentType.JSON)
			.body(jobj.toJSONString()).
		when()
			.patch("http://49.249.28.218:8091/project/NH_PROJ_5505").
		then()
			.assertThat().statusCode(200)
			.log().all();
			
		
	}
}
