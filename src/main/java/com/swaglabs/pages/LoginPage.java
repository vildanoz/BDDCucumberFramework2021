package com.swaglabs.pages;

import static com.swaglabs.base.BasePage.driver;
import com.swaglabs.base.ConfigReader;
import com.swaglabs.utils.ElementUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
  //  WebDriver driver;

    @FindBy(id="user-name")
   private static WebElement username;

    @FindBy(id="password")
    private static WebElement password;

    @FindBy(id="login-button")
    private static WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    private static WebElement errorMsg;

    public LoginPage(){
        //this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public static String verifyTitle(){
        return ElementUtil.doGetPageTitle();
    }
    public static void enterUserName(String user){
        ElementUtil.doSendText(username,user);
    }
    public static  void enterPassword(String pass){
        ElementUtil.doSendText(password,pass);
    }
    public static void clickLoginBtn() {
       ElementUtil.doClick(loginBtn);
    }

    public static String getErrorMessage(){
        return ElementUtil.doGetText(errorMsg);
    }

}
