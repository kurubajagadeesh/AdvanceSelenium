package annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTimeLoginTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test(priority=1,groups="title")
	public void ActiTimeTitle() {
		String title = driver.getTitle();
		Reporter.log(title,true);
	}
	@Test(priority=2,groups="username")
	public void userName() {
		boolean d = driver.findElement(By.id("username")).isDisplayed();
		
		System.out.println(d);
	}
	@Test(priority=3,groups="test")
	public void test1() {
		System.out.println("test 1");
	}
	@Test(priority=4,groups="test")
	public void test2() {
		System.out.println("test 2");
	}
	@Test(priority=5,groups="test")
	public void test3() {
		System.out.println("test 3");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
