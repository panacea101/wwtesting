package wwtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wwtesting.PageObject;

public class Homepage extends PageObject {

	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(tagName="title")
	private WebElement title;
	
	@FindBy(id="ela-menu-visitor-desktop-supplementa_find-a-studio")
	private WebElement findAStudio;


	public boolean isInitialized() {
		return findAStudio.isDisplayed();
	}
	
	public String findTitle(){
        System.out.print(this.title.getText());
		return this.title.getText();
	}
	public void findAStudioClick() {
		this.findAStudio.click();
	}

}