package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public ChromeOptions options;

    public BrowserDriver(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--ignore-certificate-errors");
        System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }

    public void close(){
        this.driver.close();
    }
}
