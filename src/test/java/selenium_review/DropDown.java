package selenium_review;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class DropDown extends TestBase {
    @Test
    public void dropDownTest(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);
    }
    @Test

}
