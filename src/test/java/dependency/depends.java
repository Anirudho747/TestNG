package dependency;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class depends {

	
	@Test
	public void test1() {
		System.out.println("This is Test1");
	}

	
	@Test(dependsOnMethods= {"test3","test1"})
	public void test2() {
		System.out.println("This is Test2");
	}
	
	
	@Test
	public void test3() {
		System.out.println("This is Test3");
	}
	
	
	@Test(dependsOnMethods= {"test2"})
	public void test4() {
		System.out.println("This is Test4");
	}


}
