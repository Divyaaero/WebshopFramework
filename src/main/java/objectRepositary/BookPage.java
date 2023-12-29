package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends BasePage{

	

	public WebElement getBookTitle() {
		return bookTitle;
	}


	public WebElement getSortDropdown() {
		return sortDropdown;
	}


	public WebElement getPageDropdown() {
		return pageDropdown;
	}


	public BookPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[@class='page-title']//h1")
	private WebElement bookTitle;
	
	
	//product order by
	@FindBy(id="products-orderby")
	private WebElement sortDropdown;
	
	
	//display page
	@FindBy(id="products-pagesize")
	private WebElement pageDropdown;


	
	}


	//@FindBy(id="")
	
	

}
