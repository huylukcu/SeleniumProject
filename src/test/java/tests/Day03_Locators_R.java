package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class Day03_Locators_R {

        /*
          User goes to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
          Locate the elements of Username textbox, Password textbox, and Login button
          Enter below username and password then click on login button
                  Username :  Admin
                  Password :  admin123
          Verify the login is successful
          Sign out from the page
          */
        @Test
        public void loginTest(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            WebElement usernameTextBox =driver.findElement(By.name("UserName"));
            WebElement passwordTextBox =driver.findElement(By.name("Password"));
            WebElement loginButton = driver.findElement(By.tagName("Button"));

            usernameTextBox.sendKeys("Admin");
            passwordTextBox.sendKeys("admin123");
            loginButton.click();
            //Assert the login is successful
           //https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index => Current Url
            boolean actualValue = driver.getCurrentUrl().contains("dashboard");
            assertTrue(actualValue);




        }
    }