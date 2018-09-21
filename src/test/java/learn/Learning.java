package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Learning {
	
  @Test
  public void openBrowser() {
	  
	  System.setProperty("webdriver.firefox.marionette", "E:\\geckodriver-v0.18.0-win32(1)\\geckodriver.exe");
		
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
  }
}
