package restApiPratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class TestGet {
	
	@Test
	public void GetMethod1() {
		RestAssured.baseURI="";
		RestAssured.basePath="";
		
		given()
			.cookie("cookie")
			.param("parameterName", "parameterValues")
			.header("headerName", "headerValue")
			.auth()
				.preemptive().basic("username", "password")
		.when()
			.get()
		.then()
			.statusCode(200)
			.statusLine("expectedStatusLine")			
			.cookie("cookieName", "expectedValueMatcher")
			.header("headerName", "expectedValue")
			.body("path", equalTo("responseAwareMatcher"))
			.body("path", hasItems("","","",""))
		;
	}
}
