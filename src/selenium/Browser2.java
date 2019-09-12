package selenium;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Browser2 {
	
	static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revsn\\eclipse-workspace\\Junit\\div\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.facebook.com");
Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
Assert.assertTrue(driver.getTitle().contains("sign up"));

		
}
	@AfterClass
	public static void closebrowser() {
		// TODO Auto-generated method stub
		driver.quit();
		
		}
	
	@Before
	public static void starttime() {
		// TODO Auto-generated method stub
		Date d = new Date();

	}
	
	@After
	public void endtime() {
		// TODO Auto-generated method stub
		Date d = new Date();

	}
	@Test
	public void aTest() {
		// TODO Auto-generated method stub
		System.out.println("A");

	}
	@Test
	public void cTest() {
		// TODO Auto-generated method stub
		System.out.println("C");

	}
	@Test
	public void bTest() {
		// TODO Auto-generated method stub
		System.out.println("B");

	}
	
	

}
