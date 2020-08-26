package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenerDemo {

	@Test
	public void test1()
	{
		System.out.println("inside Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("inside Test 2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("inside Test 3");
		throw new SkipException("This is skipped");
	}
}
