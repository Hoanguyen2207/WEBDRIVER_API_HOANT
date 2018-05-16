package SELENIUM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class topic_01_check_environment {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		// Firefox <=47 + selenium version 2.x.x
		// driver = new FirefoxDriver();

		// Firefox >=48 + selenium version 3.x.x
		// System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		// driver = new FirefoxDriver();
		// Chrome
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		// IE
		// System.setProperty("webdriver.ie.driver", ".\\driver\\IEDriverServer.exe");
		// driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://live.guru99.com/");
	}

	@Test
	public void TC_01() {

	}

	@Test
	public void TC_02() {

	}

	@AfterClass
	public void afterClass() {
		// quit brower
		driver.quit();
	}

}
