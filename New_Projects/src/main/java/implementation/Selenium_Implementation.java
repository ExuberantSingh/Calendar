package implementation;

import org.openqa.selenium.WebElement;

import seleniuminterface.SeleniumInterface;

public class Selenium_Implementation implements SeleniumInterface{

	@Override
	public void click(WebElement element) {
      element.click();		
	}

	@Override
	public void enterValue(WebElement element, String text) {
		// TODO Auto-generated method stub
		element.sendKeys("Gunveer Singh");
	}

}
