package Tests;


import Pages.MainPage;
import Pages.PopUp;
import Setup.SetUp;
import org.apache.xpath.SourceTree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {
    static WebDriver driver;
    String rozetkaLogin="utest4all@gmail.com";
    String rozetkaPassword="javaqa0101";


    @BeforeMethod
    public void setUp() {
        driver=SetUp.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test1(){
        WebDriverWait wait = new WebDriverWait(driver,15);
        driver.get("http://rozetka.com.ua");
        MainPage page = PageFactory.initElements(driver, MainPage.class);
        page.loginInput.click();

        PopUp popUp=PageFactory.initElements(driver,PopUp.class);
        popUp.loginUserAs(rozetkaLogin,rozetkaPassword);

        wait.until(ExpectedConditions.visibilityOf(page.profileName));
        String currentUserName=page.profileName.getText();
        System.out.println("Current user's name is "+currentUserName);
        Assert.assertTrue(currentUserName.equalsIgnoreCase("javaqa01"));

        String phones=page.smartphones.getText();
        System.out.println(phones);



        /*page.profileName.click();
        wait.until(ExpectedConditions.visibilityOf(page.linkExit));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.linkExit.click();*/


    }


}

