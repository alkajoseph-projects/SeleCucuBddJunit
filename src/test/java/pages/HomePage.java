package pages;

import org.openqa.selenium.By;

import static utils.BrowserDriver.driver;

public class HomePage {

    public static String hamburgerMenu_xpath = "//*[@id='menuToggle']/input";
    public static String signInPortal_xpath = "//*[contains(text(),'Sign In Portal')]";

    public static void clickOnHamburgerElement() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(hamburgerMenu_xpath)).click();
    }

    public static void clickOnSignInPortalElement() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(signInPortal_xpath)).click();
    }
}
