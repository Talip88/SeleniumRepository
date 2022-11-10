package TASKS._03_CSSSELECTOR;

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
    public void Test4(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);
        WebElement fakeAlerts=driver.findElement(By.cssSelector("a[id*='fakealerttest']"));
        MyFunc.Bekle(1);
        fakeAlerts.click();
        WebElement showAlert=driver.findElement(By.cssSelector("input[id*='fakealert']"));
        MyFunc.Bekle(1);
        showAlert.click();

        WebElement okButton=driver.findElement(By.cssSelector("button[id*='dialog-ok']"));
        MyFunc.Bekle(1);
        okButton.click();

        try {
            okButton.click();
            System.out.println("Test failed");
        } catch (Exception a) {
            System.out.println("Test passed");
        }
        driverBekleKapat();


    }

}
