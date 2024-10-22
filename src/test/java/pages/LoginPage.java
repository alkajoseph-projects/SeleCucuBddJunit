package pages;

import org.openqa.selenium.By;

import static utils.BrowserDriver.driver;

public class LoginPage {

    public static String userName_xpath = "//*[@id='usr']";
    public static String passWord_xpath = "//*[@id='pwd']";
    public static String loginButton_xpath = "//*[@value='Login']";

    public static void enterUsername(String username){
        driver.findElement(By.xpath(userName_xpath)).sendKeys(username);
    }

    public static void enterPassword(String password){
        driver.findElement(By.xpath(passWord_xpath)).sendKeys(password);
    }

    public static void clickOnLogin(){
        driver.findElement(By.xpath(loginButton_xpath)).click();
    }
}
