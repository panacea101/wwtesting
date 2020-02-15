package wwtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import wwtesting.PageObject;


public class IndividualStudio extends PageObject {

	public IndividualStudio(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(className="location")
	private WebElement fullLocation;
	
	@FindBy(className="location__name")
	private WebElement title;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/ui-view/ui-view/div[1]/div[2]/div/div/div[2]/div[1]/hours-list/ul/li[6]/div/div[2]")
	private WebElement currentDayHours;
	
	
	
	public boolean isInitialized() {
		ExpectedConditions.visibilityOf(fullLocation);
		return this.fullLocation.isDisplayed();
	}
	
	public String locationTitle() {
		return this.title.getText();
	}
	
	public String currentHoursTxt() {
		ExpectedConditions.invisibilityOf(currentDayHours);
		this.currentDayHours.isDisplayed();
		return this.currentDayHours.getText();
	}
	public void scrollToHours() {
	    Actions actions = new Actions(driver);
	    actions.moveToElement(currentDayHours).perform();
		ExpectedConditions.invisibilityOf(currentDayHours);
		this.currentDayHours.isDisplayed();

	}

}
