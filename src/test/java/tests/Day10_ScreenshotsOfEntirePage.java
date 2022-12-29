package tests;

import org.junit.Test;
import utilities.TestBase;

import java.io.IOException;

public class Day10_ScreenshotsOfEntirePage extends TestBase {
   /* Given user search for ‘uni’
    And select United Kingdom
    Add click on submit button
    Then verify the result contains united Kingdom*/
   @Test
   public void takeScreenShotTest() throws IOException, InterruptedException {
//        Given user search for ‘uni’
      driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
//      TAKE A SCREENSHOT. CREATE A REUSABLE METHOD AND CALL THAT METHOD
      takeScreenshotOfPage();


      //COMPLETE AS HOMEWORK
//        And select United Kingdom
      searchAndSelectFromList("uni","United Kingdom");// TEST CASE 1


//       TAKE SCREENSHOT

//        Add click on submit button
//        TAKE SCREENSHOT
//        Then verify the result contains united Kingdom
//        TAKE SCREENSHOT
   }


}
