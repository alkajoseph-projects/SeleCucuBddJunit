package pages;

import org.openqa.selenium.By;

import static utils.BrowserDriver.driver;

public class ProductCatagoryPage {

    public static String productHeading = "//*[@id='ShoeType']";

    public static String visibleProduct(){
        String verifyProductPage = driver.findElement(By.xpath(productHeading)).getText();
        return verifyProductPage;
    }
}
