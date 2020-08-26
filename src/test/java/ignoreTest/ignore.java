package ignoreTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class ignore {

	@Test
	public void test1() {
		System.out.println("This is Test1");
	}

	@Test
	public void test2() {
		System.out.println("This is Test2");
	}
	
	@Ignore
	@Test
	public void test3() {
		System.out.println("This is Test3");
	}
	
	
	@Test
	public void test4() {
		System.out.println("This is Test4");
	}


}
