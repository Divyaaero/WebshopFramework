package genericLibrary;

public class WebDriverUtility1 {
	class WebdriverUtility {

		public static void selectOptionByIndex(WebElement dropdown,int index) {
			Select select=new Select(dropdown);
			select.selectByIndex(index);
			
		}
		public static void selectOptionByValue(WebElement dropdown,String value) {
			Select select=new Select(dropdown);
			select.selectByValue(value);
			
		}
		public static void selectOptionByVisibleText(WebElement dropdown,String value) {
			Select select=new Select(dropdown);
			select.selectByVisibleText(value);
			
		}
		
	}


	
	}


