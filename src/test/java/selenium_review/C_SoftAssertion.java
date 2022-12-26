package selenium_review;

import org.junit.Assert;
import org.junit.Test;

public class C_SoftAssertion {
    @Test
    public void test1() {
        System.out.println("starting");

        Assert.assertTrue(true);  //eger false yazarsak starting yazar sonrasinda execute olmaz

        System.out.println("done");
    }
        /*
        Assertion/verification: If fails, whole test will fai;
        Validation: if something fails, it does not the stop the test
         */

    }
