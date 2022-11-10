package TASKS._04_XPATH;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06 extends BaseDriver {

    //Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
//
//Fake Alerts'e tıklayınız.
//
//Show modal dialog buttonuna tıklayınız.
//
//Ok'a tıklayınız.
//
//Alert kapanmalıdır.

@Test
    public void Test6(){

    driver.get("https://testpages.herokuapp.com/styled/index.html");

    WebElement fakeAlerts=driver.findElement(By.xpath("//*[@id='fakealerttest']"));

    fakeAlerts.click();

    MyFunc.Bekle(1);

    WebElement dialog=driver.findElement(By.xpath("//*[@id='modaldialog']"));

    dialog.click();

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
