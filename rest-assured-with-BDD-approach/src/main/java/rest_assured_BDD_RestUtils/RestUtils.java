package rest_assured_BDD_RestUtils;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	public static String getFirstName() {
		String randomString=RandomStringUtils.randomAlphabetic(1);
		return ("azhar"+randomString);
	}
	
	public static String getLastName() {
		String randomString=RandomStringUtils.randomAlphabetic(1);
		return ("kadri"+randomString);
	}
	
	public static String getUserName() {
		String randomString=RandomStringUtils.randomAlphabetic(1);
		return ("azharkadri"+randomString);
	}
	
	public static String getPassword() {
		String randomString=RandomStringUtils.randomAlphabetic(1);
		return ("azharkadri"+randomString);
	}
	
	public static String getEmail() {
		String randomString=RandomStringUtils.randomAlphabetic(1);
		return ("azharkadri"+randomString+"@gmail.com");
	}
	
	public static String getEmpName() {
		String randomString=RandomStringUtils.randomAlphabetic(1);
		return ("azharkadri"+randomString);
	}
	
	public static String getEmpSalary() {
		String randomString=RandomStringUtils.randomNumeric(5);
		return (randomString);
	}
	
	public static String getEmpAge() {
		String randomString=RandomStringUtils.randomNumeric(2);
		return (randomString);
	}
	


}

