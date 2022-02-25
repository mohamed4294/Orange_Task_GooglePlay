package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apps {

	private WebDriver driver; 
	private WebDriverWait wait;
	
	By Category = new By.ByXPath("//span[@class='kgGUm']");
	By Education = new By.ByXPath("//a[@href='/store/apps/category/EDUCATION']");
	By MyApps = new By.ByXPath("//a[@href='/apps']");
	
	public Apps(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void clickOnCategory() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Category));
		driver.findElement(Category).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Education));
		driver.findElement(Education).click();
		
	}
	
	public boolean myAppsIsAppeared() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(MyApps));
		return driver.findElement(MyApps).isDisplayed();
	}
	
	
	
	/* 
	public void clickOnEducation(){
		driver.findElement(Education);	
	}*/
}
