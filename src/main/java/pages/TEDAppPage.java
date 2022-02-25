package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TEDAppPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	By TED = new By.ByXPath("//div[@title='TED']");
	
	public TEDAppPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public boolean tedPage() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TED));
		return driver.findElement(TED).isDisplayed();
	}
	

}
