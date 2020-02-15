import org.testng.Assert;
import org.testng.annotations.Test;

import BasePage.BasePage;
import wwtesting.Homepage;


public class NewTest extends BasePage{
  @Test
  public void wwTest() {
		
		Homepage homepage = new Homepage(driver);
		
        Assert.assertTrue(homepage.isInitialized());
        //Assert.assertEquals(homepage.findTitle(),"WW (Weight Watchers): Weight Loss & Wellness Help");
        //homepage.findAStudioClick();
	  
  }
}
