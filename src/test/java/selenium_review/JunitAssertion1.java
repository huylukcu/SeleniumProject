package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

    public class JunitAssertion1 {

        @Test
        public void test01() {
            //1. Launch browser
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            //2. go to url 'http://automationexercise.com'
            driver.get("http://automationexercise.com");

            //3. Verify that home page is visible successfully
            WebElement logoElement= driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
            Assert.assertTrue(logoElement.isDisplayed());

            //4. Click on 'Signup / Login' button
            WebElement signUpLink= driver.findElement(By.xpath("//a[text()=' Signup / Login'] "));
            signUpLink.click();
            //5. Verify 'Login to your account' is visible
            WebElement loginElement= driver.findElement(By.xpath("//h2[text()='Login to your account']"));
            Assert.assertTrue(loginElement.isDisplayed());

            //6. Enter correct email address and password
            WebElement email= driver.findElement(By.xpath("//input[@data-qa='login-email']"));
            email.sendKeys("ahmet@nehaber.com");
            WebElement passwordKutusu= driver.findElement(By.xpath("//input[@data-qa='login-password']"));
            passwordKutusu.sendKeys("12345");

            //7. Click 'login' button
            driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
            //8. Verify that 'Logged in as username' is visible
            WebElement loggedIn= driver.findElement(By.xpath("//a[text()=' Logged in as '] "));
            Assert.assertTrue(loggedIn.isDisplayed());

            //9. Click 'Logout' button
            driver.findElement(By.xpath("//a[text()=' Logout'] ")).click();

            //10. Verify that user is navigated to login page
            String expectedUrl="https://automationexercise.com/login";
            String actualUrl= driver.getCurrentUrl();
            Assert.assertEquals(expectedUrl,actualUrl);
            //11. Close driver
            driver.close();
        }
    }

