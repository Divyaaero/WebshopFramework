package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void beforeSuit() {
		//Reporter.log("\"beforesuite\"open the data base connection",true);
		Reporter.log("brforesuite,true");
	}
	@AfterSuite
	public void afterSuit() {
		Reporter.log("aftersuite",true);	
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("beforetest",true);
	}
	@BeforeTest
	public void beforeTest1() {
		Reporter.log("beforetest",true);
		
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("beforeclass",true);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("afterclass",true);
		driver.findElement(By.linkText("Log in")).click();
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("aftermethod",true);
		driver.findElement(By.linkText("Log in")).click();
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("log out",true);
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("palanidivyaaero@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("divy@aero143");
        driver.findElement(By.xpath("[value='Log in']")).click();

	}
	
	
	@BeforeSuite
	public void beforeSuit1() {
		Reporter.log("beforesuite1",true);
		
	}  
	

}
