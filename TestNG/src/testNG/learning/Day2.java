package testNG.learning;

import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void Day2CarLoanLogin() {
		System.out.println("Day2 - Car Loan - Login");
	}

	@Test
	public void Day2CarLoanUserName() {
		System.out.println("Day2 - Car Loan - UserName");
	}
	
	@Test
	public void Day2CarLoanPassword() {
		System.out.println("Day2 - Car Loan - Password");
	}
	
	@Test(groups= {"smoke"})
	public void GroupMethod2() {
		System.out.println("Group method 2 from the Day2 class");
	}
	
}
