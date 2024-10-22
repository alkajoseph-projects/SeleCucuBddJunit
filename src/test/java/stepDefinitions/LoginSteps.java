package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static pages.HomePage.*;
import static pages.LoginPage.*;
import static pages.ProductCatagoryPage.*;

import static utils.BrowserDriver.driver;

public class LoginSteps {

    @Given("User navigated to Login page")
    public void navigateToSignInPortal() throws InterruptedException {
        clickOnHamburgerElement();
        clickOnSignInPortalElement();
    }

    @When("User enters {string} and {string}")
    public void enterCredentials(String username, String password){
        enterUsername(username);
        enterPassword(password);
    }

    @And("User clicks on Login button")
    public void clickLoginButton(){
       /*
       explicit wait
        */
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        WebElement element = wait.until(ExpectedConditions.elementToBeVisible(driver.findElement(By.xpath(loginButton_xpath))));
        /*
        implicit wait
         */
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
        clickOnLogin();
    }

    @Then("User should see the Products category and take screenshot")
    public void viewProducts() throws IOException {
        String verifyProductPage = visibleProduct();
        Assert.assertEquals(verifyProductPage, "Formal Shoes");
        File screenshotProducts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("Product Page Screenshot.png");
        FileUtils.copyFile(screenshotProducts,destinationFile);
        System.out.println("Screenshot File path" + destinationFile.getAbsolutePath());
    }

}
