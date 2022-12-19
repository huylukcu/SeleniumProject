package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class RadioButton {
     WebDriver driver;
        @Before
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");
        }
        @Test
       public void radioButtonTest() {
            //Select red
            WebElement redOpt = driver.findElement(By.id("red"));
            redOpt.click();
            Assert.assertTrue(redOpt.isSelected());//verify the red button selected
            //Select hockey
            WebElement hockOpt = driver.findElement(By.id("hockey"));
            hockOpt.click();
            Assert.assertTrue(hockOpt.isSelected());

        }
        @After
    public void tearDown() {
            driver.quit();
        }
    }
