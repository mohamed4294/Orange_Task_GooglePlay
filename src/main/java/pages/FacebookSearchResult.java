package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSearchResult {

	private WebDriver driver;
	private WebDriverWait wait;  
	
	By FacebookIcon = new By.ByXPath("//div[@title='Facebook']");
	
	public FacebookSearchResult(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean facbookIconIsAppeared() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FacebookIcon));
		return driver.findElement(FacebookIcon).isDisplayed();
	}
}
