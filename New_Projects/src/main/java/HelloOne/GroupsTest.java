package HelloOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class GroupsTest {

    static WebDriver driver ;
    @BeforeMethod
    public void launch(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
    }


 @Test
    void test1(){
        System.out.println("First Test");
    }

    @Test
    void test2(){
        System.out.println("Second Test");
    }
    @Test
    void test3(){
        System.out.println("Third Test");
    }
    @Test
    void test4(){
        System.out.println("Fourth Test");
    }

}
