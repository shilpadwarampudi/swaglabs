package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class steps 
{
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() 
	{
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe"); 
	  driver=new ChromeDriver();
	  lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) 
	{
	    driver.get(url);
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_Username_as_and_Password_as(String username, String password) 
	{
	   lp.setUsername(username);
	   lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_Login() 
	{
	    lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String Title) 
	{
	 // String pgTitle= driver.getTitle();
	//  System.out.println("Title is:"+pgTitle);
	  if(driver.getTitle().equals(Title))
	  {
		  Assert.assertTrue(true);
	  }
	  else 
	  {
	  Assert.assertTrue(false);
	  }
	 
	}
	@Then("Error message should be {string}")
	public void error_message_should_be(String msg) 
	{
	    String errmsg=lp.getTextMsg();
	    System.out.println("Error msg is:"+errmsg);
	    if(errmsg.contains("Sorry, this user has been locked out"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}

	@Then("close browser")
	public void close_browser()
	{
	   driver.quit();
	}


}
