package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import PageObject.loginPage;

public class Open_Customers extends TestBase{
	@Test
	public void LoginOpenCustomers() throws Exception{
		
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		login.checkLogin();
		
		
	}

}