package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WenOrder {
    WebDriver driver;

    @Test
     public void setup(){

    //  user goes to http://a.testaddressbook.com/sign_in
        WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    //  IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.manage().window().maximize();
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
}
}
