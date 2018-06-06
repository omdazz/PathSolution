package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver = null;
	
	@Test
	  public void Intilize() throws IOException{
		//"C:\\Users\\Mohamed.Emad\\eclipse-workspace\\WebDriverTestMaven\\src\\main\\java\\Drivers"
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\src\\main\\java\\Drivers\\chromedriver.exe"));
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://192.168.112.44/i50kamcoQC/security/Signin.aspx");
		
	}
	
	 @AfterSuite
	  public void teerDownTest() {
		//  TestBase.driver.quit();
	  }

}
