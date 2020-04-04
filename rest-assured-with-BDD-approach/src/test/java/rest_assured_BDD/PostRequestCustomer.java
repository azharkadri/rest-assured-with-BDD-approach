package rest_assured_BDD;

import rest_assured_BDD_RestUtils.RestUtils;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class PostRequestCustomer {
	
	public static HashMap<String,String> map=new HashMap<String,String>();
	
	@BeforeMethod
	public void postData() {
		map.put("FirstName",RestUtils.getFirstName());
		map.put("LastName",RestUtils.getLastName());
		map.put("UserName",RestUtils.getUserName());
		map.put("Password",RestUtils.getPassword());
		map.put("Email",RestUtils.getEmail());
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
	}
	
	@Test
	public void testPostCustomer() {
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
		.then()
			.assertThat().statusCode(201)
			.and()
			.assertThat().body("SuccessCode",equalTo("OPERATION_SUCCESS"))
			.and()
			.assertThat().body("Message",equalTo("Operation completed successfully"));
		
	}

}
