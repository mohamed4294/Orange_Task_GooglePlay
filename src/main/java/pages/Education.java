package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Education {

	private WebDriver driver;
	private WebDriverWait wait;
	
	
	By Search = new By.ByXPath("//input[@id='gbqfq']");
	//By SearchButton = new By.ByXPath("//span[@class='gbqfi gb_uc']");
	//By Educational = new By.ByXPath("//button[@id='action-dropdown-parent-Educational']/..");
	
	public Education(WebDriver driver) {
		this.driver = driver;
	}
	
	public void search(String text) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Search));
		driver.findElement(Search).sendKeys(text);
		driver.findElement(Search).sendKeys(Keys.ENTER);
		//driver.findElement(SearchButton).click();	
	}	
	
	public String educationIsAppeared() {
		return driver.getCurrentUrl();
	}
}
