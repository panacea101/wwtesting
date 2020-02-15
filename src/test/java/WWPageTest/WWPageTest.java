package WWPageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePage.BasePage;
import wwtesting.FindAStudioPage;
import wwtesting.Homepage;
import wwtesting.IndividualStudio;
import wwtesting.MyWWModal;

public class WWPageTest extends BasePage {
  @Test
  public void assertHomepageTitle() {
		Homepage homepage = new Homepage(driver);
		
        Assert.assertTrue(homepage.isInitialized());

        Assert.assertEquals(driver.getTitle(),"WW (Weight Watchers): Weight Loss & Wellness Help");
        homepage.findAStudioClick();
  }
  
  @Test(priority=1) 
  public void closeMyWWPopup() {
	  	MyWWModal myWW = new MyWWModal(driver);
	  	//Assert.assertTrue(myWW.isInitialized());
	  	myWW.closePopup();
  }
  
  @Test(priority=2)
  public void findAStudioPageTitle() {
	  	FindAStudioPage studioPage = new FindAStudioPage(driver);
	  	Assert.assertTrue(studioPage.isInitialized());
	  	//Assert.assertEquals(driver.getTitle(),"Find WW Studios & Meetings Near You | WW USA");

	  	String actualTitle = driver.getTitle();
	  	actualTitle.equals("Find WW Studios & Meetings Near You | WW USA");
  }
  
  @Test(priority=3)
  public void searchByZipcode() {
	  	FindAStudioPage studioPage = new FindAStudioPage(driver);
	  	Assert.assertTrue(studioPage.isInitialized());
	  	studioPage.enterZip("10011"+ Keys.ENTER);
	  	studioPage.clickSearchBtn();	  
  }
  @Test(priority=4)
  public void searchResults() {
	  	FindAStudioPage studioPage = new FindAStudioPage(driver);
	  	Assert.assertTrue(studioPage.isInitialized());
	  	String title = studioPage.searchResultTitle();
	  	String distance = studioPage.searchResultDistance();
	  	System.out.println(title + " "+distance);
	  	studioPage.clickFirstTitle();
	  	IndividualStudio indStudioPage = new IndividualStudio(driver);
	  	Assert.assertTrue(indStudioPage.isInitialized());
	  	Assert.assertEquals(indStudioPage.locationTitle(), title);
	  	//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)");
	  	System.out.println(indStudioPage.currentHoursTxt());
	  	
  }
//  @Test(priority=5)
//  public void assertTitleAndDistance() {
//	  	FindAStudioPage studioPage = new FindAStudioPage(driver);
//
//  }
}
