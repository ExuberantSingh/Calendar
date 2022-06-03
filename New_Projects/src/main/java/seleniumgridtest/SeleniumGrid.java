package seleniumgridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN10);
		
		FirefoxOptions foptions = new FirefoxOptions();
		foptions.merge(cap);
		
	    ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://10.20.20.115:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), foptions);
		driver.get("https://www.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
			
	}
            
}
