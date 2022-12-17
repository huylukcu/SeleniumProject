package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustTry {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://amazon.com");}
     @Test
     public void test() {
         driver.findElement(By.id("searchDropdownBox"));
     }
      @Test
      public void test2() {
        driver.get("https://kansascity.craigslist.org/");
        driver.findElement(By.className("jobs")).click();




        }
    }
