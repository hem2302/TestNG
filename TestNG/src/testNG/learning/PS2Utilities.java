package testNG.learning;

public class PS2Utilities extends PS3 {

	int a;

	public PS2Utilities(int a) {
		super(a);
		this.a=a;
	}

	public int increment() {
		a = a + 1;
		return a;
	}
}
