package Practises.homework;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class Q03 extends TestBase {
    /*
    Then create 3 different test methods using the following names. And Go to google.
    titleTest =>Verify if google title = “Google”
    imageTest => Verify if google image displays or not
    gmailLinkTest => Verify if the Gmail link is displayed or not
    Close the browser after each test
     */
       @Test
      public void titleTest() {
           driver.get("https://www.google.com/");
           Assert.assertTrue(driver.getTitle().contains("Google"));
       }
        @Test
      public void imageTest() {
            driver.get("https://www.google.com/");
        }}