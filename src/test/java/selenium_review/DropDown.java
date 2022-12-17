package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class DropDown {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.manage().window().maximize();
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
    @Test
    public void selectByIndexTest(){
//    select Option 1 by index from the dropdown
//        1. locate the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
//        2. Create Select object cause dropdown is in the select tag. this is for only dropdowns
        Select select = new Select(dropdown);
//        3. Select any option using the select object
        select.selectByIndex(1); // index starts at 0
    }
    //2.Create method selectByValueTest Select Option 2 by visible text
    @Test
    public void selectByVisibleTextTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
    }

    //3.Create method selectByVisibleTextTest Select Option 1 value by value
    @Test
    public void selectByValueTest(){

    }
//4.Create method printAllTest Print all dropdown value
//5. Verify the dropdown has Option 2 text
//6.Create method printFirstSelectedOptionTest Print first selected option
//7.Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
}
