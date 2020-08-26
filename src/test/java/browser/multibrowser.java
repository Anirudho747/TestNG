package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multibrowser {
	
	WebDriver driver = null;
	String projectpath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void  setup(String browser) {
		System.out.println("Browser name is "+browser);
		System.out.println(Thread.currentThread().getId());
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("mozilla"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("explorer"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	}
	
	@Test
	public void test1()
	{
		driver.get("https://www.google.com/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	@AfterTest
	public void  teardown() {
		driver.close();
		System.out.println("Test completed");
	}

}
