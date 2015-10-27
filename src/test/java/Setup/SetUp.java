package Setup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
    static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","/Users/kamillaubyyko/Documents/chromedriver");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
