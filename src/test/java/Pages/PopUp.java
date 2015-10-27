package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopUp {
    @FindBy(xpath ="//*[@name=\"login\"]")
    public WebElement userName;

    @FindBy(xpath ="//*[@name=\"password\"]")
    public WebElement userPassword;

    @FindBy(xpath ="//*[@name=\"auth_submit\"]")
    public WebElement submit;


    public void loginUserAs (String login, String password){
        userName.sendKeys(login);
        userPassword.sendKeys(password);
        submit.click();

    }



}
