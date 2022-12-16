package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
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
    public void radioButtonTest() throws InterruptedException {
            driver.findElement(By.id("yellow")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("blue")).click();

        }

    }
