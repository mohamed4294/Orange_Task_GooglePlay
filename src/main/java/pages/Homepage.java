package pages;

import java.time.Duration;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	private WebDriver driver ;
	private WebDriverWait wait;
	
	By appsButton = new By.ByCssSelector("li[class='uQeS5e qKjvAb iZhiic'] span[class='pvVVcb']");
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnApp() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(appsButton));
		driver.findElement(appsButton).click();
	
		
	}
}
