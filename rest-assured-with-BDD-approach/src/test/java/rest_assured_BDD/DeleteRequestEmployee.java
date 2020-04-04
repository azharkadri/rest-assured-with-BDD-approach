package rest_assured_BDD;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequestEmployee {
	
	public static int empId=12453;
	
	@Test
	public void deleteRequestEmployee() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete"+empId;
		
		Response response=
		//String response=************
		given()
		.when()
			.delete()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all()
			//.log().body().extract().jsonPath().get("path");
			//.log().body().extract().cookie("name");**************
			.extract().response()
			;
		
		String jsonAsString=response.asString();
		Assert.assertEquals(jsonAsString.contains("successful! deleted Records"),true);
		
		
	}

}
