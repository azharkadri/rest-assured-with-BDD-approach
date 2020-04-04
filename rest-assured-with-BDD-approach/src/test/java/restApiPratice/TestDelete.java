package restApiPratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class TestDelete {
	
	HashMap<String,String> parametersMap=new HashMap<String,String>();
	HashMap<String,String> cookiesMap=new HashMap<String,String>();
	HashMap<String,String> headersMap=new HashMap<String,String>();
	
	@Test
	public void deleteMethod1() {
		
		RestAssured.baseURI="";
		RestAssured.basePath="";
		
		given()
			.cookies(cookiesMap)
			.params(parametersMap)
			.auth().oauth("consumerKey", "consumerSecret", "accessToken", "secretToken")
			.header("ContentType","application/json")
			.headers(headersMap)
			
		.when()
			.delete()
		.then()
			.assertThat()
			.statusCode(200)
			.and()
			.statusLine("expectedStatusLine")	
			.log().all()
		;	
	}
}
