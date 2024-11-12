package com.sampleCrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleTestForPut {
	@Test
	public void getDataToServer() {
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Washiq");
		jobj.put("projectName", "Straw_2");
		jobj.put("status", "Created");
		jobj.put("teamSize", 0);
		
		
//		Response rep =  RestAssured.get("http://49.249.28.218:8091/projects");
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jobj.toJSONString());
		
		Response resp =  req.put("http://49.249.28.218:8091/project/NH_PROJ_5485");
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
		
		
	}
}
