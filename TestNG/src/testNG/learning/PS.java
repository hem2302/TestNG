package testNG.learning;

import org.testng.annotations.Test;

public class PS extends PS1{


	@Test
	public void child() {
		execute();
		PS2Utilities obj = new PS2Utilities(3);
		System.out.println(obj.increment());
		System.out.println("the multiplication is: "+obj.multiplyBy2());
	}

	
}
