package annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void usernameEnable() {
		boolean b = driver.findElement(By.id("username")).isEnabled();
		Assert.assertTrue(b);
	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String expectedTitle = "actiTIME - Login";
		Assert.assertEquals(expectedTitle, title);
	}

//	@Test(invocationTimeOut = 1)
//	public void infiteloop() {
//		int i = 1;
//		while (i == 1) {
//			System.out.println(i);
//		}
//	}

	@Test(dependsOnMethods = "login")
	public void homePage() {
		System.out.println("HomePage");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
