package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Loginbtn;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public void clickOnLoginBtn()
	{
		Loginbtn.click();
	}
	public void clickOnLogout()
	{
		logout.click();
	}


}
