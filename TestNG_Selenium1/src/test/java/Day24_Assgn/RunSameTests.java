package Day24_Assgn;

import org.testng.annotations.Test;

public class RunSameTests {
	@Test(invocationCount = 3)
	public void RunTests() {
		System.out.println("Running Same Tests ");
	}
}
