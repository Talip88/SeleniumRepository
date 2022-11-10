package TASKS._04_XPATH;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//5-
//
//Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//
//Fake Alerts' tıklayınız.
//
//Show Alert Box'a tıklayınız.
//
//Ok'a tıklayınız.
//
//Alert kapanmalıdır.
public class _05 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts=driver.findElement(By.xpath("//*[@id='fakealerttest']"));
        fakeAlerts.click();
        MyFunc.Bekle(1);

        WebElement showAlert=driver.findElement(By.xpath("//*[@id='fakealert']"));
        showAlert.click();
        MyFunc.Bekle(1);


        WebElement ok=driver.findElement(By.xpath("//*[@id='dialog-ok']"));
        ok.click();
        MyFunc.Bekle(1);

        try {
            ok.click();
            System.out.println("Test failed");
        } catch (Exception a) {
            System.out.println("Test passed");
        }
        driverBekleKapat();



    }
}
