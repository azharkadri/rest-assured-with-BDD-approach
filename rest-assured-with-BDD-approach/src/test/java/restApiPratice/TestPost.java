package restApiPratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class TestPost {
	
		
	@Test
	public void postMethod1() {
		
		HashMap<String,String> cookiesMap=new HashMap<String,String>(); 
		HashMap<String,String> parametersMap=new HashMap<String,String>();
		HashMap<String,String> headersMap=new HashMap<String,String>();
		HashMap<String,String> objectMap=new HashMap<String,String>();
		HashMap<String,String> expectedCookies=new HashMap<String,String>();
		
		RestAssured.baseURI="";
		RestAssured.basePath="";
		
		given()
			.cookies(cookiesMap)
			.params(parametersMap)
			.auth().oauth2("accessToken")
			.headers(headersMap)
			.body(objectMap)		
		.when()
			.post()
		.then()
			.statusCode(201)
			.statusLine("expectedStatusLine")
			.header("ContentType", "application/json")
			.cookies(expectedCookies)
			.body("arguments", equalTo("responseAwareMatcher"))
			.body("path", hasItems("responseAwareMatcher"))
			.log().all()
			//.extract().cookie("name")
			//.extract().header("name")
			//.extract().response().body().jsonPath().prettify();
		;	
	}
}
