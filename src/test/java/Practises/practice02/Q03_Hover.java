package Practises.practice02;

import utilities.TestBase;

public class Q03_Hover extends TestBase {
    /*
   Given
        Go to https://www.gmibank.com/
   When
        Hover over "Premium" Deposit Package
   And
        Click on "Book Now"
   Then
        Verify url contains "services"
    */
    public void setUp(){
       // Go to https://www.gmibank.com/
        driver.get("https://www.gmibank.com/");




    }

}
