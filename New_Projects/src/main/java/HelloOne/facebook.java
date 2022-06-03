package HelloOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Set;

import static HelloOne.HelloOne.randomdate.createRandomDate;

public class facebook {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.co.in/");
        //driver.findElement(By.linkText("Create an account")).click();
        // driver.findElement(By.name("q")).sendKeys("Gunveer");


        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Gunveer Singh", Keys.ENTER);
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Google Search")).click();
        //Thread.sleep(5000);
        // driver.findElement(By.xpath("//input[contain(@type,'submit')]")).click();

        driver.navigate().to("https://www.facebook.com/");

        driver.findElement(By.linkText("Create New Account")).click();

      /*  Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();
        it.next();*/
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']//parent::div")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gunveer");
//        driver.findElement(By.name("lastname")).sendKeys("Singh");
//        driver.findElement(By.name("reg_email__")).sendKeys("999999999");
        // driver.findElement(By.xpath("//div[@id='password_field']/preceding::div[@class='mbm _a4y']")).sendKeys("123456@Singh");

        WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));

        Select select = new Select(day);
        select.selectByVisibleText("5");

        Select select1 = new Select(month);
        select1.selectByVisibleText("Jan");
        Select select2 = new Select(year);
        select2.selectByVisibleText("1992");
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//input[starts-with(@id,'u_2_5_')]")).click();

        driver.findElement(By.xpath("//div[@id='password_field']//following-sibling::div[@class='_1lch']//button[starts-with(@id,'u_2_s_')]")).click();

        // WebElement radio =  driver.findElement(By.id("u_2_5_"));
        // radio.click();

//        driver.navigate().to("https://www.google.co.in/");
//        driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Java", Keys.ENTER);
//        Thread.sleep(6000);
//        //driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
//        driver.findElement(By.xpath("//h3[contains(text(),'Java | Oracle')]")).click();
//        //h3[contains(text(),'Java | Oracle')]


        driver.navigate().to("https://html.com/input-type-file/");
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\GunveerSingh\\Downloads\\GunveerFile.xls");

        driver.navigate().to("https://www.makemytrip.com");
        driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
        driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();


        LocalDate randomDate = null;
        for (int i = 0; i < 1; i++) {
            randomDate = createRandomDate(2000, 2100);
            System.out.println(randomDate);
        }

        String bookingdate0 = String.valueOf(randomDate);

        String[] temp00 = bookingdate0.split("-");
        String year00 = temp00[0];
        String month00 = temp00[1];
        String date00 = temp00[2];

        System.out.println("The date is " + date00);

        int year01 = Integer.parseInt(year00);
        int month01 = Integer.parseInt(month00);

        System.out.println("The Random Year After Conversion is : " + year01);
        System.out.println("The Random Year After Conversion is : " + month01);


        String bookingdate = "21-November-2022";

        String[] temp = bookingdate.split("-");
        String date = temp[0];
        String month1 = temp[1];
        String year1 = temp[2];
//             String yearMonth = driver.findElement(By.className("DayPicker-Caption")).getText();
//             String[] G = yearMonth.split(" ");
//             String
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        while (true) {
            if (driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().split("\\ ")[0].equals(month1) && driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().split("\\ ")[1].equals(year1)) {
                break;
            } else {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"))).click();
                Thread.sleep(500);
            }
        }

        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DayPicker-Caption']"))).getText());

        driver.findElement(By.xpath(String.format("(//div[@class='dateInnerCell']//p[contains(text(),'%s')])[1]", date))).click();

        Actions action = new Actions(driver);

        WebElement flights = driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHotels']"));
        action.moveToElement(flights).click().perform();

        driver.navigate().to("https://www.browserstack.com/");

        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");

        Actions ac = new Actions(driver);

        WebElement live = driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='Live']"));
        ac.moveToElement(live).build().perform();

        driver.navigate().to("https://seleniumpractise.blogspot.com/search?q=calendar");
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        WebElement currentyearDate = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
        String yearText = currentyearDate.getText();

        int cYear = Integer.parseInt(yearText);

        System.out.println("The Year is " + yearText);



        int mm = month01 ;
        String MM = null;
        switch(mm){
            case 1:  MM = "January";
                break;
            case 2:  MM = "February";
                break;
            case 3:  MM = "March";
                break;
            case 4:  MM = "April";
                break;
            case 5:  MM = "May";
                break;
            case 6:  MM = "June";
                break;
            case 7:  MM = "July";
                break;
            case 8:  MM = "August";
                break;
            case 9:  MM = "September";
                break;
            case 10: MM = "October";
                break;
            case 11: MM = "November";
                break;
            case 12: MM = "December";
                break;
            default: MM = "Invalid month";
                break;
        }


        System.out.println("Random Month Generated is : "+ MM);



        if (year01 < cYear) {
            while (true) {
                if (driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split("\\ ")[0].equals(MM) && driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split("\\ ")[1].equals(year00)) {
                    break;
                } else {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"))).click();
                }
            }
        } else {

            while (true) {
                if (driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split("\\ ")[0].equals(MM) && driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split("\\ ")[1].equals(year00)) {
                    break;
                } else {
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"))).click();
                }
            }

        }


    }

}

