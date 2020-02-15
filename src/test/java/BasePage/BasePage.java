package BasePage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BasePage {
	 protected static WebDriver driver;
//  @Test
//  public void f() {
//  }
  @BeforeClass
  public static void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.weightwatchers.com/us/");
	  driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
      driver.quit();
  }

//  @BeforeTest
//  public void beforeTest() {
//	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	  String handles = driver.getWindowHandle();
//	  System.out.print(handles);
//  }
//  @AfterTest
//  public void afterTest() {
//	  driver.switchTo().alert().dismiss();
//  }



}
