package objectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="Email")
	private WebElement email;
	
	
	@FindBy(id="Password")
	private WebElement password;
	
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRememberme() {
		return rememberme;
	}
  
	public WebElement getLogin() {
		return login;
	}
	@FindBy(id="RememberMe")
	private WebElement rememberme;
	
	//@FindBy(css = "Forgot password?")
	//private WebElement forgotpasswordLink;
	
	//public WebElement getForgotpasswordLink() {
		//return forgotpasswordLink;
	}
	@FindBy(css = "input[value='Log in']")
	private WebElement login;
	
	
	
public void login(WebDriver driver) {
	Homepage homepage=new Homepage(driver);
	homepage.getLoginText();
	getEmail().sendKeys("palanidivyaaero@gmail.com");
	getPassword().sendKeys("divy@aero143");
	getRememberme().click();
	getLogin().click();
	
	
}


public void logOut(WebDriver driver) {
	Homepage homepage=new Homepage(driver);
	
	homepage.getLoginText().click();
}
		
	}


 