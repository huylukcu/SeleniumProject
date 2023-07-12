package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_MyPrctise {
    public static void main(String[] args) {
        /*
              WebDriver driver = new ChromeDriver();
              WebDriver driver = new FirefoxDriver();
              WebDriver driver = new EdgeDriver();
              -->we use polimorphism here. Using object in multiple form.
               Creating WebDriver I automated application in different browsers
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://etsy.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
    }
}
