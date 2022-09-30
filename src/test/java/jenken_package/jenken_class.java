package jenken_package;

import org.testng.annotations.Test;

public class jenken_class {
	public class CreateTest {

		@Test
		public void Created() {
			Reporter.log("smoke");
		}
		@Test
		public void Created1() {
			System.out.println("smoke1");
		}
}
}
