package wwtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wwtesting.PageObject;

public class FindAStudioPage extends PageObject{

	public FindAStudioPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(tagName="title")
	private WebElement title;
	
//	@FindBy(xpath="//*[@class=\"bx-button\"]/button and text() = 'No Thanks']")
//	private WebElement closeButton;
	
	@FindBy(id="header")
	private WebElement findAStudio;
	
	@FindBy(id="meetingSearch")
	private WebElement meetingSearch;
	
	@FindBy(xpath="//form/div/button")
	private WebElement searchBtn;

	@FindBy(className="location__name")
	private WebElement searchResultTitle;
	
	@FindBy(className="location__distance")
	private WebElement searchResultDistance;

	public boolean isInitialized() {
		return findAStudio.isDisplayed();
	}
	
	public void enterZip(String zipcode){
		this.meetingSearch.clear();
		this.meetingSearch.sendKeys(zipcode);
	}
    public void clickSearchBtn() {
    	this.searchBtn.isEnabled();
    	this.searchBtn.click();  
    }
    public String searchResultTitle() {
    	return this.searchResultTitle.getText();
    }
    public String searchResultDistance() {
    	return this.searchResultDistance.getText();
    }
    public void clickFirstTitle() {
    	this.searchResultTitle.isEnabled();
    	this.searchResultTitle.click();
    }

}
