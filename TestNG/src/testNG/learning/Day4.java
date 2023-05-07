package testNG.learning;

import org.testng.annotations.Test;

public class Day4 {

	@Test(groups = { "smoke" })
	public void GroupMethodExample4() {
		System.out.println("I am the group 4 method from the Day 4 class");
	}
	
}
