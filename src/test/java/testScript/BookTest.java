package testScript;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;
import genericLibrary.WebdriverUtility;
import objectRepositary.BookPage;
import objectRepositary.Homepage;

public class BookTest extends BaseClass {
	public static ExtentTest test; 
	
	
	@Test
	
	public void verifyBookTest() {
		Homepage homepage=new Homepage(driver);
		
		BookPage bookpage=new BookPage(driver);
		Reporter.log("verify books page is displayed",true);
		//click on bookLink
		homepage.getBooks().click();
		test.log(LogStatus.INFO,"clicked");
	//	test.log(LogStatus.INFO,"clicked on book links");
		//store bookpage title
		String PageHeading =bookpage.getBookTitle().getText();
		
	try {
		Assert.assertEquals(PageHeading, "Books","Books is not Displayed");
		test.log(LogStatus.FAIL,"Test case completed");
	}
	catch(AssertionError e) {
		String path=WebdriverUtility.getScreenshotOfWebPage(driver);
		test.log(LogStatus.FAIL,test.addScreenCapture(path));
	}
		
		
	}
	@Test
	public void addBookCart() {
	Homepage homepage=new Homepage(driver);
		
		BookPage bookpage=new BookPage(driver);
		homepage.getBooks().click();
		WebdriverUtility.selectOptionByIndex(bookpage.getSortDropdown(),2);
		WebdriverUtility.selectOptionByValue(bookpage.getPageDropdown(),"https://demowebshop.tricentis.com/books");
		//store bookpage title
		test.log(LogStatus.INFO,"Option is selected");
		
		
	}
	
	}
	





