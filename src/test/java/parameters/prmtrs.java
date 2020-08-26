package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class prmtrs {

	@Parameters({"First_name"})
	@Test
	public void test(@Optional("API") String name) {
		System.out.println("My name is "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
