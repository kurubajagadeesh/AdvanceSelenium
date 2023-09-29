package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	//@Before(pre-conditions Annotations)
	@BeforeSuite
	public void setup() {
		Reporter.log("setup for chrome",true);
	}
	@BeforeTest
	public void launchBrowser() {
		Reporter.log("launch chrome browser",true);
	}
	@BeforeClass
	public void enterurl() {
		Reporter.log("enterurl",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("loginApp",true);
	}
	@Test
	public void titleTest() {
		Reporter.log("title",true);
	}
	@Test
	public void task() {
		Reporter.log("task",true);
	}
	@Test
	public void users() {
		Reporter.log("user",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
	}
	@AfterTest
	public void deleteAllCookes() {
		Reporter.log("deleteAllCookes",true);
	}
	@AfterSuite
	public void report() {
		Reporter.log("Report should be generate",true);
	}

}
