package selenium_review;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Action extends TestBase {
    @Test
    public void rightclickTest(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //Right-click on the box
        Actions actions = new Actions(driver);

    }
}