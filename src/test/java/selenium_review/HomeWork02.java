package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    /*
    Create a new class : GoogleSearchTest 
    Create main method and complete the following task. 
    When user goes to https://www.google.com/
    Search for “porcelain teapot”
    And print how many related results displayed on Google
     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");


        driver.findElement(By.id("input")).sendKeys("porcelain teapot"+ Keys.ENTER);


    }
    }

