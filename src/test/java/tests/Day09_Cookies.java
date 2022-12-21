package tests;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class Day09_Cookies extends TestBase {
    @Test
    public void cookieTest(){
      //  -Go to
        driver.get("https://www.amazon.com");
//        1. Find the total number of cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
//        2. Print all the cookies
        for (Cookie eachCookie : allCookies){
            System.out.println("Cookie ==>>> "+eachCookie);
        }
//        3. Get the cookies by their name
//        4. Add new cookie
//        5. Delete cookie by name
//        6. Delete all of the cookies
    }    }
