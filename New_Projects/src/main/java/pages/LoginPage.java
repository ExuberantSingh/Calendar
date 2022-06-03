package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniuminterface.SeleniumInterface;
import seleniuminterface.TestBase;

public class LoginPage extends TestBase {
public LoginPage(SeleniumInterface obj) {
		super(obj);
	
	}
WebDriver driver;
	public void clickOnMarket() {
		WebElement ss = driver.findElement(By.xpath("(//a[contains(text(),'Marketplace')])[4]"));
	      obj.click(ss);
	}
	public void enterValueByHomepage() {
		WebElement dd =driver.findElement(By.xpath("(//a[contains(text(),'Marketplace')])[4]"));
		obj.enterValue(dd,"gunveer");
	}
}
