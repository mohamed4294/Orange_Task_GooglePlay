package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectTed {
	private WebDriver driver;
	private WebDriverWait wait;
	
	By TedIcon = new By.ByXPath("//div[@title='TED']");
	
	public SelectTed(WebDriver driver) {
		this.driver = driver;
	}
	
	public void chooseTed() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(TedIcon));
		driver.findElement(TedIcon).click();
	}

	public String getURL() {
		return driver.getCurrentUrl();
	
		
	}
}
