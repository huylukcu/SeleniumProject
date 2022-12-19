package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_LinkText {
    WebDriver driver;
    @Before
    public  void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    @Test
    public void LMSPage(){
        driver.get("https://techproeducation.com/");
        //Click on LMS LOGIN
        //LMS LOGIN IS A LINK
        //TEXT OF THAT LINK IS "LMS LOGIN"
        driver.findElement(By.linkText("LMS LOGIN")).click();
    }
    @Test
    public void LMSPagePartialLinkText(){
        driver.get("https://techproeducation.com/");
        driver.findElement(By.partialLinkText("LMS LO")).click();
    }

}
