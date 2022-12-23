package selenium_review;

import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class WindowHandle1 extends TestBase {
    public void test(){
//Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");

        //Then user verifies the text : “Opening a new window”

        //Then user verifies the title of the page is “The Internet”

        //GETTING THE WINDOW 1 HANDLE(UNIQUE PAGE ID)

        //When user clicks on the “Click Here” button

        //Then user verifies the new window title is “New Window”
        //WE DO TESTING IN A NEW WINDOW, SO WE MUST SWITCH TO THAT WINDOW
        //AS OF NOW 2 WINDOWS OPEN. USE getWindowHandles() TO GET BOTH IDS

        //NOTE: Driver is on the window1 loop through all windows switch to the onethat is not window1 handle

    }
}
