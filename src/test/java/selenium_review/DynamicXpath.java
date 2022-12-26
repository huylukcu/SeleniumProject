package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class DynamicXpath {

    //        Verify if "Username : Admin" text is displayed on the page
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");
    }

    @Test
    public void dynamic_xpath() {
//     There are different xpath to locate a text element on a page
//     1. xpath:  "//*[.='Text of the element']"
//        //        Verify if "Username : Admin" text is displayed on the page
//        WebElement userNameText = driver.findElement(By.xpath("//*[.='Username : Admin']"));
//        assertTrue(userNameText.isDisplayed());
//
//        //        Verify if "Password : admin123" text is displayed on the page
//        WebElement passwordText = driver.findElement(By.xpath("//*[.='Password : admin123']"));
//        assertTrue(passwordText.isDisplayed());

        //  2. xpath "//*[text()='Text of the element']"
        // Verify if "Username : Admin" text is displayed on the page
        WebElement professionalText = driver.findElement(By.xpath("//*[text()='Professional ']"));
        assertTrue(professionalText.isDisplayed());

//        3. xpath "//*[contains (text()='Part or full text of the element')]"

    }
        @After
    public void tearDown(){
        driver.quit();
    }
}
