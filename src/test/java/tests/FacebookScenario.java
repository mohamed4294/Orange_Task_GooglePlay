package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Education;
import pages.FacebookSearchResult;


public class FacebookScenario extends TestBase{
	

 Education educationObject;
 FacebookSearchResult facebookObject;
	
	@Test  
	public void user_can_search_for_facebook() {
		educationObject = new Education(driver);
		educationObject.search("Facebook");
		facebookObject = new FacebookSearchResult(driver);
		Assert.assertTrue(facebookObject.facbookIconIsAppeared(), "The user is in incoorect page");
		
	}

}
