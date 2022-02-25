package tests;
import org.testng.Assert;
import org.testng.annotations.Test;


import pages.Apps;
import pages.Education;
import pages.Homepage;
import pages.SelectTed;
import pages.TEDAppPage;

public class TedScenario extends TestBase{
	
	Homepage homeObject;
	Apps appsobject;
	Education educationobject;
	SelectTed selectobject;
	TEDAppPage tedobject;
	
	@Test (priority = 1)
	public void user_Can_Open_Apps() {
		homeObject = new Homepage(driver);
		homeObject.clickOnApp();
		appsobject = new Apps(driver);
		Assert.assertTrue(appsobject.myAppsIsAppeared() , "The user is in incorrect Page");
	}
	
	@Test (priority = 2)
	public void user_can_select_education_from_category() {
		appsobject = new Apps(driver);
		appsobject.clickOnCategory();
		educationobject = new Education(driver); 
		Assert.assertEquals(educationobject.educationIsAppeared() , "https://play.google.com/store/apps/category/EDUCATION" , "The user is in incorrect Page");
		
	}
	@Test (priority = 3)
	public void user_can_search_for_TED_application() {
		educationobject = new Education(driver);
		educationobject.search("TED");
		selectobject = new SelectTed(driver);
		Assert.assertEquals(selectobject.getURL() , "https://play.google.com/store/search?q=TED&c=apps" , "The user is in incorrect Page" );		
	}
	/*
	@Test(priority = 4)
	public void user_can_select_TED_application() {
		selectobject = new SelectTed(driver);
		selectobject.chooseTed();
		tedobject = new TEDAppPage(driver);
		Assert.assertTrue(tedobject.tedPage() , " The user is in incorrect page");
	}*/
}

