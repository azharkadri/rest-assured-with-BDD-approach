package rest_assured_BDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetWeatherHyderabad {
	
	@Test
	public void getWeatherHyderabad() {
		given()
		.when()
				.get("http://restapi.demoqa.com/utilities/weather/city/hyderabad")
		.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.assertThat().body("City", equalTo("Hyderabad"))
				.header("Content-Type", "application/json");
				
		
		
	}
}
