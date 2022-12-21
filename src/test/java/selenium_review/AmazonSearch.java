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
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");//go to url

       String searchItem = "dyson";
       driver.findElement(By.id("twotabsearchtextbox")).
               sendKeys(searchItem + Keys.ENTER);

       String actual = driver.findElement(By.id("twotabsearchtextbox")).getText();
       if(searchItem.equals(actual)){
           System.out.println("pass");
       }else{
           System.out.println("fail");
           System.out.println("actual= "+ actual);
           System.out.println("searchItem = "+ searchItem);
       }

}}