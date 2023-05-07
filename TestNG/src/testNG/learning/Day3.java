package testNG.learning;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeSuite
	public void IAmTheNumberOne() {
		System.out.println("I am the number one from the before suite method");
	}
	@Test
	public void Day3HomeLoanLogin() {
		System.out.println("Day 3 - Home Loan - Login");
	}

	@Test(dependsOnMethods = {"Day3HomeLoanPassword","Day3HomeLoanLogin"})
	public void Day3HomeLoanUserName() {
		System.out.println("Day 3 - Home Loan - UserName");
	}

	@Test
	public void Day3HomeLoanPassword() {
		System.out.println("Day 3 - Home Loan - Password");
	}
	
	@Test(groups= {"smoke"})
	public void GroupMethodExample3() {
		System.out.println("I am the group method 3 from the Day 3 class");
	}
}
