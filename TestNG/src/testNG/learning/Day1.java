package testNG.learning;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method in the day 1 class");
	}

	@Test
	public void PersonalLoanLoginday1() {

		System.out.println("Day1 - Personal Loan");
	}

	@Parameters({ "url" })
	@Test
	public void PersonalLoanUserNameDay1(String urlName) {
		System.out.println("The url name pulled usin the paramater from the XML file: " + urlName);
		System.out.println("Day 1 - Personal Loan - User Name");
	}

	@Test(dataProvider = "getData") // Data Provider
	public void PersonalLoanPasswordDay1(String username, String password) {
		System.out.println("Day 1 = Personal Loan - Password");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(groups = { "smoke" })
	public void GroupTestMethod1() {
		System.out.println("Group method one from the Day 1 class");
	}

	@DataProvider
	public Object[][] getData() {

		// Execute the same test case using 3 combinations
		// 1. With valid username and password
		// 2. With Valid username and invalid password
		// 3. With invalid username and valid password

		// So its 3 rows and 2 columns

		Object[][] data = new Object[3][2];
		data[0][0] = "first user name";
		data[0][1] = "first password";

		data[1][0] = "second user name";
		data[1][1] = "second password";

		data[2][0] = "third username";
		data[2][1] = "third password";
		return data;
	}
}
