package objectRepositary;

import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginText;
	@FindBy(partialLinkText = "Shopping")
	private WebElement logintext;
	
	@FindBy(linkText = "Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchtermsLink;
	
	@FindBy(css="[value='Search']")
	private WebElement searchbutton;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginText() {
		return loginText;
	}

	public WebElement getLogintext() {
		return logintext;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchtermsLink() {
		return searchtermsLink;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

public WebElement getBooks() {
		return books;
	}

@FindBy(partialLinkText = "Books")
private WebElement books;





	
	

}
