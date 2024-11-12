package com.sampleCrudWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForPut {
	@Test
	public void putDataToServer() {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Washiq");
		jobj.put("projectName", "Berlin");
		jobj.put("status", "Created");
		jobj.put("teamSize", 0);
		
		given()
			.contentType(ContentType.JSON)
			.body(jobj.toJSONString())
		.when()
			.put("http://49.249.28.218:8091/project/NH_PROJ_5505")
		.then()
			.assertThat().statusCode(200)
			.log().all();
		
		
	}
}
