package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utils.BrowserDriver.driver;

public class NewUserRegPage {

    public static String registerButton = "//*[@id='NewRegistration']";
    public static String verifyRegSuccess = "//*[contains(text(),'User Registered Successfully !!!')]";
    public static String salutationDropdown = "//*[@id='Salutation']";
    public static String newFirstname = "//*[@id='firstname']";
    public static String newLastname = "//*[@id='lastname']";
    public static String newEmailID = "//*[@id='emailId']";
    public static String newContact = "//*[@id='contactNumber']";
    public static String newUsername = "//*[@id='usr']";
    public static String newPassword= "//*[@id='pwd']";
    public static String submitButton = "//*[@type='submit']";

    public static void clickOnRegister(){
        driver.findElement(By.xpath(registerButton)).click();
    }

    public static void clickOnSalutation(){
        Select dropdown = new Select(driver.findElement(By.xpath(salutationDropdown)));
        dropdown.selectByVisibleText("Ms.");
    }

    public static void enterFirstname(){
        driver.findElement(By.xpath(newFirstname)).sendKeys("newFirst");
    }

    public static void enterLastname() {
        driver.findElement(By.xpath(newLastname)).sendKeys("newLast");
    }

    public static void enterEmail() {
        driver.findElement(By.xpath(newEmailID)).sendKeys("newEmail@gmail.com");
    }

    public static void enterContact() {
        driver.findElement(By.xpath(newContact)).sendKeys("+91 9988776655");
    }

    public static void enterUsername() {
        driver.findElement(By.xpath(newUsername)).sendKeys("newUser");
    }

    public static void enterPassword() {
        driver.findElement(By.xpath(newPassword)).sendKeys("newPass");
    }

    public static void clickOnSubmit(){
        driver.findElement(By.xpath(submitButton)).click();
    }

    public static String verifyNewUserRegSuccess(){
        String userRegSuccess = driver.findElement(By.xpath(verifyRegSuccess)).getText();
        return userRegSuccess;
    }

}
