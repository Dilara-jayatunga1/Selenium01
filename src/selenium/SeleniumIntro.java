package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		
	//Invoke the browser
	//Firefox -> Firefox Driver -> Methods
	//create object  of the class to access the methods present in class
		
		//Fire fox driver launch - gecko driver
		//this is optional now after updated versions
		//System.setProperty("webdriver.gecko.driver", "/Users/dilarajayatunga/Documents/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		//webDriver methods + class methods
		driver.get("https://www.youtube.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
	}

}
