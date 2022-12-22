package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    public static void main(String[] args) {
        /*
        Steps:
        Create a new class under : BasicNavigations
        Create main method
        Set Path
        Create chrome driver
        */
       /*For Atomation classimiza otomasyon icin gerekli web driver in yerini gostermeliyiz.
        Bunun icin Java library den System.setProperty() metodunu kullaniriz.method iki parametre
        istemektedir.
        --> kullanicagimiz driver:webdriver.chrome.driver
        --> driverin bilgisyarda bulundugu yer:/src/resources/drivers/chromedriver
        */

        // 1 - Setup Chrome driver
        System.setProperty("webdriver.chrome.driver","./src/resources/drivers/chromedriver");

        //2 - Create Chrome driver
        WebDriver driver = new ChromeDriver();  //driver object i olusturduk

        //3 - Write Test scripts
        //Maximize the window
        driver.manage().window().maximize();

        //Open google home page https://www.walmart.com/.
        driver.get("https://www.walmart.com/");

        // On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

        // Navigate back to walmart
        driver.navigate().back();

        //Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

        //Close/Quit the browser
        //driver.close();
        driver.quit();

    }
}
