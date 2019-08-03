import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TC1 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		//WebDriver driver;
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		System.out.println("ja");
	}

}
