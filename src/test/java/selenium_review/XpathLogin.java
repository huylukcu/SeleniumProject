package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLogin {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();//
        driver= new ChromeDriver();//create driver
        driver.

    }
}
