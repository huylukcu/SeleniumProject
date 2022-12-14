package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_Locators {
    @Test
    public void logInTest(){

        //user goes to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Locating the userName and typing the password
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        //driver.findElement(By.name("username")).sendKeys("Admin");

        //Locating the userName and typing
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();






   /* Enter below username and password then click sign in button 
    Username :  testtechproed@gmail.com 
    Password : Test1234! 
    Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page)
    Verify the Addresses and Sign Out  texts are displayed
    Find the number of total link on the page
    Sign out from the page
    */


    }

}
