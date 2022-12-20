package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class H01_AmznDropDown {
    /*
    Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
    Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
    Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
    Print the the total number of options in the dropdown
    Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
            BONUS: Assert if the dropdown is in Alphabetical Order
  */
    WebDriver driver;
    @Before
    public void setUp(){
        //Go to https://www.amazon.com/
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            driver.get("https://www.amazon.com/");
        }
        @Test
        //Create A Method dropdownTest
        public void dropdownTest() {
            //Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
            WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
            Select select = new Select(dropdown);
            select.selectByIndex(0);
        }
        @Test
    public void print(){
           //** Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
            WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
            Select select = new Select(dropdown);
            List<WebElement>allOptions = select.getOptions();//it(getoptions) turns list
            for(WebElement eachOpt: allOptions){
                System.out.println(eachOpt.getText());

            }




        }


}

