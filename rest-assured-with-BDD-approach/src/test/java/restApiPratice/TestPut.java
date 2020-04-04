package restApiPratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class TestPut {
	
	HashMap<String,String> cookiesMap=new HashMap<String,String>(); 
	HashMap<String,String> parametersMap=new HashMap<String,String>();
	HashMap<String,String> headersMap=new HashMap<String,String>();
	HashMap<String,String> objectMap=new HashMap<String,String>();
	HashMap<String,String> expectedCookies=new HashMap<String,String>();
	
	
	@Test
	public void putMethod1() {
		RestAssured.baseURI="";
		RestAssured.basePath="";
		
		Response response1=
		given()
			.cookies(cookiesMap)
			.params(parametersMap)
			.auth().oauth2("accessToken")
			.headers(headersMap)
			.body(objectMap)		
		.when()
			.put()
		.then()
			.statusCode(201)
			.statusLine("expectedStatusLine")
			.header("headerName", "expectedValue")
			.body("path", equalTo("matcher"))
			.assertThat().body("base.parent.child_path", hasItems("","","",""))
			.log().all()
			.extract().response()
			;
		//JsonPath
		System.out.println(response1.getStatusCode());
		System.out.println(response1.getStatusLine());
		System.out.println(response1.getCookies());
		System.out.println(response1.getHeaders());
		System.out.println(response1.getTime());
		System.out.println(response1.getBody().jsonPath().prettify());
		
	}

}
