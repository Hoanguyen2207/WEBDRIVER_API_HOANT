package SELENIUM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class topic_00_TestcaseTemplate {
	// Khai bao 1 driver
	WebDriver driver;
	
  
	@BeforeClass
	  public void beforeClass() {
		//Khoi tai trinh duyet
		driver = new FirefoxDriver();
		
		//wait cho page duoc load thanh cong
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//maximize browser len full man hinh
		driver.manage().window().maximize();
		
		//get url cua app
		driver.get("http://live.guru99.com/");
	  }
	
	@Test
  public void TC_01_CheckTitle() {
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("Home page", homePageTitle);
  }
  
	@Test
	  public void TC_02_CheckURL() {
		String homePageURL = driver.getCurrentUrl();
		Assert.assertEquals("http://live.guru99.com/", homePageURL);
	  }
	
  @AfterClass
  public void afterClass() {
	  //quit brower
	  driver.quit();
  }

}
