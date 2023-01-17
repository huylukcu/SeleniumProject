package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.openqa.selenium.*;
import utilities.TestBase;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day11_ExtendReports extends TestBase {

    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;
    @BeforeClass
    public static void extentReportsSetUp() {
        //      REPORT  PATH
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/test-output/reports/" + currentTime + "html_report.html";
//        creating HTML report in the path
        extentHtmlReporter = new ExtentHtmlReporter(path);
//        creating extent reports object for generating the Entire reports with configuration
        extentReports = new ExtentReports();
//        ***************
//        adding custom System Info
        extentReports.setSystemInfo("Test Environment", "Regression");
        extentReports.setSystemInfo("Application", "TechProEd");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Team", "Eagles");
        extentReports.setSystemInfo("SQA", "John Fox");
        extentReports.setSystemInfo("Sprint Number", "SP205");
//        adding more custom info
        extentHtmlReporter.config().setReportName("TechProEd home page");
        extentHtmlReporter.config().setDocumentTitle("TechProEd extent reports");
//        ********************
//        DONE WITH CONFIGURATION
        extentReports.attachReporter(extentHtmlReporter);
//        SUMMARY: Extent Reports and Extent HTML Reporter is used to add custom information on the report and create the report in a PATH
//        REPORT IS DONE. NOW CREATING EXTENT TEST TO LOG INFO IN THE TEST CASE
//        Creating extent test
        extentTest = extentReports.createTest("My Extent Reporter", "Regression Test Report");
    }

    @Test
    public void extentReportsTest() {
        driver.get("https://www.techproeducation.com");
        extentTest.pass("User is on TechPro Education Home page");
//        click on LMS
        driver.findElement(By.linkText("LMS LOGIN")).click();
        extentTest.pass("User is on LMS home page");
//        verify the URL
        String expectedURL = "https://lms.techproeducation.com/";
        String actualURL = driver.getCurrentUrl();
        extentTest.pass("Asserting the LMS URL");
        Assert.assertEquals("LMS LOGIN PAGE IS NOT DISPLAYED", expectedURL, actualURL);
        extentTest.pass("TEST IS COMPLETE");
    }
    @Test
    public void extentReportsTest2(){
//        pass is used to mark the step as PASSED
        extentTest.pass("PASS");
//        info is used to just give an information for that step
        extentTest.info("INFO");
//        fail is used to mark the step as FAILED
        extentTest.fail("FAILED");
//        skip is used to mark the step as SKIPPED
        extentTest.skip("SKIPPED");
//        warning is used to give working information
        extentTest.warning("WARNING");
    }
    @AfterClass
    public static void extentReportsTearDown() {
//        generating the report
        extentReports.flush();
        /*
         * *Extent Reports:
         * HTML reporting tool, it gives us HTML reports
         * It helps us to save our test steps and results
         * We can add also screenshots.
         *
         * We will create 3 objects
         * 1. ExtentReports extendReport => we need this object to start reporting.
         * extentReports.flush(); we use this method to generate and end the report
         *
         * 2.ExtentHtmlReporter extendHtmlReporter => it helps us to configuration of reports.
         * We will use it to set the path where report will be saved
         *
         * 3.ExtentTest extentTest => To add information, to add logs.
         * We will add some explanation to our test steps
         /*
         * Interview Questions
         * ***** How do you get report?
         * When I do manual testing, I get screenshot manually and type test steps and results
         * to a Word document, and I can upload it JIRA
         *
         * When I do automation, I use extent reports generating the reports.
         * I can configure extent report based on my project information
         * In my project we customize extend report in a way that when test case fails
         * it will screenshot automatically.
         *
         * ***** What is the advantages of extent reports?
         * Open source (free)
         * Works with different browsers and platform
         * We can customize each step
         * We can log each step
         * It can work with different frameworks, junit, testng..
         *
         *
         * ***** How extent reports generate the test report?
         * We use Maven, We added extent report dependency to our pom.xml file
         * We have a reusable class, we make configuration in this class
         *
         * ExtentReports
         * ExtentHtmlReport   ==>> for generating reports
         * ExtentTest
         *
         *ExtentReports and ExtentHtmlReport are used for adding custom information
         * such as browser, environment..
         *
         * ExtentTest => to log every step of test case => skip, fail, pass, warning ...
         *
         * ****** Where do you get your dependencies?
         *  We can get dependencies from company repository. I check and get the dependency
         * If I can not find the dependency which I needed, I will ask test lead, manager, technical lead...
         * */




    }
    }
 }