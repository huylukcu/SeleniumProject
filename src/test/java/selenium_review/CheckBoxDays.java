package selenium_review;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDays {
    /*
    go to https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox
    verify monday is not selected
    select monday
    verify monday is select
     */
    @Test
    public void setup() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement monday = driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
       // System.out.println(monday.isSelected());
       // monday.click();

        if(!monday.isSelected()){
            monday.click();
        }
        System.out.println(monday.isSelected());
    }
}

