package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportTest {
  
	@Test
	public void  ReportTest() {
		//passing the report path
    	ExtentReports report=new ExtentReports("./reports/report.html");
    	ExtentTest test=report.startTest("loginTest");
    	
    	WebDriver driver=new ChromeDriver();
    	test.log(LogStatus.INFO, "chrome browser is launched");
    	driver.manage().window().maximize();
    	test.log(LogStatus.INFO, "chrome browser is maximized");
    	driver.get("https://demowebshop.tricentis.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement(By.partialLinkText("Log in")).click();
    	driver.findElement(By.id("Email")).sendKeys("palanidivyaaero@gmail.com");
    	driver.findElement(By.id("Password")).sendKeys("Divy@aero143");
    	driver.findElement(By.cssSelector("[value='Log in']")).click();
    	
    	Assert.assertEquals(driver.findElement(By.linkText("Log out")). isDisplayed(),true,"log out is not displayed");
    	test.log(LogStatus.INFO, "Login successfull");
    	report.endTest(test);
    	report.flush();
    	driver.quit(); 
    	

}
    @Test
   	public void  ReportTest2() {
       	
       	 test=report.startTest("login2");
       	
        WebDriver driver=new ChromeDriver();
       	test.log(LogStatus.INFO, "chrome browser is launched");
       	driver.manage().window().maximize();
       	test.log(LogStatus.INFO, "chrome browser is maximized");
       	driver.get("https://demowebshop.tricentis.com/");
       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       	driver.findElement(By.partialLinkText("Log in")).click();
       	driver.findElement(By.id("Email")).sendKeys("palanidivyaaero@gmail.com");
       	driver.findElement(By.id("Password")).sendKeys("Divy@aer143");
       	driver.findElement(By.cssSelector("[value='Log in']")).click();
       	
       	Assert.assertEquals(driver.findElement(By.linkText("Log out")). isDisplayed(),true,"log out is not displayed");
       	test.log(LogStatus.INFO, "Login successfull");
       	report.endTest(test);
       	report.flush();
       	driver.quit(); 
       	

   }
}

//s}