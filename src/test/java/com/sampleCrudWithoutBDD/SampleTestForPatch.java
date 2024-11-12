package com.sampleCrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForPatch {

	@Test
	public void patchDataToServer() {
		JSONObject jobj = new JSONObject();
		jobj.put("projectName", "Straw");
		
		
//		Response rep =  RestAssured.get("http://49.249.28.218:8091/projects");
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jobj.toJSONString());
		
		Response resp =  req.patch("http://49.249.28.218:8091/project/NH_PROJ_5485");
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
		
		
	}
}
