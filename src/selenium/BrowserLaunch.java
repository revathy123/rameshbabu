package selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BrowserLaunch {
	
	@BeforeClass
	public static void launchbrowser() {
		// TODO Auto-generated method stub
		System.out.println("launch");

	}
	@AfterClass
	public static void closebrowser() {
		// TODO Auto-generated method stub
		System.out.println("close");

	}
	@Before
	public void starttime() {
		// TODO Auto-generated method stub
		System.out.println("start");

	}
	@After
	public void endtime() {
		// TODO Auto-generated method stub
		System.out.println("end");

	}
	
	@Test
	public void aTest() {
		// TODO Auto-generated method stub
		System.out.println("A");

	}
	
	@Test
	public void zTest() {
		// TODO Auto-generated method stub
System.out.println("z");
	}
	@Test
	public void cTest() {
		// TODO Auto-generated method stub
		System.out.println("c");

	}
	@Test
	public void bTest() {
		// TODO Auto-generated method stub
		System.out.println("b");

	}
	private void sysout() {
		System.out.println("123");

	}


}
