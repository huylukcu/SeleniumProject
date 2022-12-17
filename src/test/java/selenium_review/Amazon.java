package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    /*
    open browser
    go to http://amazon.com
    verify that default dropdown option is all
    verify that all options are sorted alphabeticly
    click on the menu icon on the left


     */
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://amazon.com");
    }
    @Test
    public void  test(){
        ///finding element with a select tag
        WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
        //
    }

}
