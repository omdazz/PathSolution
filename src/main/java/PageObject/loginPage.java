package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Tests.TestBase;

public class loginPage extends TestBase
{
	WebDriver driver;
	public loginPage(WebDriver driver){ 
	         this.driver=driver; 
	}
	
	//Using FindBy for locating elements
	@FindBy(how=How.ID, using="txtUserName") public WebElement username;
	@FindBy(how=How.ID, using="txtpassword") public WebElement password;
	@FindBy(how=How.ID, using="btnLogin") public WebElement loginButton;
	
	public void checkLogin() 
	{
		//Actions for elements
		username.sendKeys("Administrator");
		password.sendKeys("admin12");
		loginButton.click();
	}
}
