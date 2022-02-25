package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
  public WebDriver driver;
  
  @BeforeClass
  public void setupDriver() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://play.google.com/store");
  }

  
 @AfterClass
 public void closeDriver() {
	 driver.quit();
 }
  	
 	
}
