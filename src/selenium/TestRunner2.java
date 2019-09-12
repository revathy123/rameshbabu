package selenium;

import java.util.List;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result rs = JUnitCore.runClasses(BrowserLaunch.class,Launch.class);
		System.out.println("Run count:"   +rs.getRunCount());
		System.out.println("failure count:" +rs.getFailureCount());
		System.out.println("Ignore Count:"  +rs.getIgnoreCount());
		System.out.println("Time Count:"     +rs.getRunTime() );
		List<Failure> f = rs.getFailures();
		for(Failure fail : f) {
			System.out.println(fail);
		}

	}

}
