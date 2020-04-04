package rest_assured_BDD;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import rest_assured_BDD_RestUtils.RestUtils;

public class PutRequestEmployee {
	
	public static  HashMap<String,String> map=new HashMap<String,String>();
	
	@BeforeMethod
	public void putData() {
		map.put("name", RestUtils.getEmpName());
		map.put("salary", RestUtils.getEmpSalary());
		map.put("age", RestUtils.getEmpAge());
		int empId=12453;
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+empId;
	}
	
	@Test
	public void TestPut() {
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.assertThat().statusCode(200)
			.log().all();
		
	}

}
