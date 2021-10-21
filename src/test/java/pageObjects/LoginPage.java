package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;//initiates the driver
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="user-name")
	@CacheLookup
	WebElement txtUsername;
	public void setUsername(String uname)
	{
		txtUsername.clear();
		txtUsername.sendKeys(uname);
	}
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtPassword;
	public void setPassword(String pwd)
	{
		txtUsername.clear();
		txtPassword.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@name='login-button']")
	@CacheLookup
	WebElement btnLogin;
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	@FindBy(xpath="//div[@class='error-message-container error']")
	@CacheLookup
	WebElement getTextMsg;
	public String getTextMsg()
	{
		return getTextMsg.getText();
	}
}
