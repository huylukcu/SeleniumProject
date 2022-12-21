package selenium_review;

import org.junit.Test;
import utilities.TestBase;

public class IFrames extends TestBase {
    @Test
    public void iframeTest(){


   // Create a class: IFrame
   //Create a method: iframeTest
   // Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");
   //Verify the Bolded text contains “Editor”
    //Locate the text box
    //Delete the text in the text box
    //Type “This text box is inside the iframe”
    //Verify the text Elemental Selenium text is displayed on the page
}}
