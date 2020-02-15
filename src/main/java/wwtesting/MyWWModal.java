package wwtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import wwtesting.PageObject;

public class MyWWModal extends PageObject{
	
	

	public MyWWModal(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(className="bx-close-xsvg")
	private WebElement closeButton;
	
	public boolean isInitialized() {
		ExpectedConditions.visibilityOf(closeButton);
		closeButton.isEnabled();
		return closeButton.isDisplayed();
	}
	
	public FindAStudioPage closePopup() {
		closeButton.click();
		return new FindAStudioPage (driver);
	}

}
