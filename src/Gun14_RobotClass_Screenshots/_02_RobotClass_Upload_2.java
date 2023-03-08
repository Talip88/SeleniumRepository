package Gun14_RobotClass_Screenshots;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _02_RobotClass_Upload_2 extends BaseDriver {
    @Test
    public void Test1 () throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        Robot rbt = new Robot();

        for (int i = 0; i < 21; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
            MyFunc.Bekle(1);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadMesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));

        Assert.assertTrue(uploadMesaj.getText().contains("has been successfully uploaded."));



        driverBekleKapat();


    }
}