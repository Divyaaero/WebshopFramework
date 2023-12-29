package genericLibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import objectRepositary.LoginPage;

public class BaseClass1 extends WebdriverUtility {
	
	public WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("open the connection to database",true);
		
		report=new ExtentReports(REPORTS_PATH);
		
	}
	@AfterSuite
	public void afterSuite() {
		report.flush();
		Reporter.log("close the connection to database",true);
		
		
		//flush methos is used to
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("beforetest",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("aftertest",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("beforeclass launch the browser enter url",true);
		String browser=FileUtility.getProperty("browser");
		String url=FileUtility.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
	   else if (browser.equalsIgnoreCase("edge")) {
		  driver=new EdgeDriver();
			
		}
	   else if (browser.equalsIgnoreCase("firefox")) {
		   driver=new FirefoxDriver() ;
			
		}
	   else {
		driver=new ChromeDriver();
	}
		
		
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		initObjects(driver);
		
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("afterclass",true);
		//driver.findElement(By.linkText("Log in")).click();
		driver.close();
	}
	

	
	@BeforeMethod
	public void beforermethod(Method method) {
		String methodName=method.getName();
		test=report.startTest(methodName);
		
		Reporter.log("Login");
		LoginPage loginpage=new LoginPage(driver);
			
		loginpage.login(driver);	
			
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("Log out");
	LoginPage loginpage=new	LoginPage(driver);
	 loginpage.logOut(driver);
	 report.endTest(test);
	 Reporter.log("after method lgout",true);
		
	}

	
	}



