package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MainPage {

    @FindBy (xpath ="//*[@name=\"signin\"]")
    public WebElement loginInput;

    @FindBy (xpath ="//*[@name=\"profile\"]")
    public WebElement profileName;

    /*@FindBy (xpath="//*[@name=\"personal_information\"]")
    public WebElement linkExit;*/

    @FindBy (css = "#popular-categories > div > div:nth-child(1) > a:nth-child(2) > span.popular-categories-i-img > img")
    public WebElement smartphones;
}
