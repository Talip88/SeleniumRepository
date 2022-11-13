package GUN15_15_Assertion;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;

public class _01_AssertionEntry extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://wwww.automationtesting.co.uk");

        String pageTitle=driver.getTitle();
        Assert.assertEquals("expected", "actual");

        Assert.assertEquals("Homepage", pageTitle);




    }
}
