package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    //open browser
    //go to amazon
    //enter search and submit
    //verify search box still contains the same search term
    WebDriver driver;
    @Test
   public void setUp() {
        //User goes to "https://www.amazon.com/"
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        driver.findElement(By.id("twotabsearchtextbox")).
                sendKeys("charger"+ Keys.ENTER);

}}