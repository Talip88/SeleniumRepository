package TASKS._02_CSSSELECTOR;

import Utility.BaseDriver;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Tasks extends BaseDriver {
    //1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    //2- Business i çekleyin.
    //3- discover XYZ ye tıklatın ve online Advertising i seçin
    //4- Every day i seçin
    //5- Good u seçin
    //6- using XYZ yi tıklatın ve 3.seçeneği seçin...

    @Test
    public void Test1()

    {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(1);
        WebElement business=driver.findElement(By.cssSelector("input[id='u_9hi_4586_0']+span"));//[type='radio'][value='Business']
        MyFunc.Bekle(1);
        business.click();
        MyFunc.Bekle(1);
        WebElement option=driver.findElement(By.cssSelector("select[name='u_9hi_4588']"));//
        MyFunc.Bekle(1);
        option.click();
        MyFunc.Bekle(1);
        WebElement onlineAdvertising=driver.findElement(By.cssSelector("option[value='Online Advertising']"));//select[id=$='_4588']>:nth-child(4)
        MyFunc.Bekle(1);
        onlineAdvertising.click();
        MyFunc.Bekle(1);
        WebElement everyDay=driver.findElement(By.cssSelector("input[id='u_9hi_89585_0']+span[class='label-body']"));//[type='radio'][value='Every Day']
        MyFunc.Bekle(1);
        everyDay.click();
        MyFunc.Bekle(1);
        WebElement Good=driver.findElement(By.cssSelector("input[id='u_9hi_4589_0']+span[class='label-body']"));//[type='radio'][value='Good']
        MyFunc.Bekle(1);
        Good.click();
        MyFunc.Bekle(1);

        WebElement usingXYZ=driver.findElement(By.cssSelector("select[name='u_9hi_4597']"));
        MyFunc.Bekle(1);
        usingXYZ.click();
        MyFunc.Bekle(1);

        WebElement XYZ=driver.findElement(By.cssSelector("select[id='u_9hi_4597']>option[value*='month or more']"));//select[id='u_9hi_4597']>:nth-child(4)
        MyFunc.Bekle(1);
        XYZ.click();
        MyFunc.Bekle(1);


        Good.click(); //dropdown kapansın diye herhangi bir yere tıklattık
        driverBekleKapat();
    }

}
