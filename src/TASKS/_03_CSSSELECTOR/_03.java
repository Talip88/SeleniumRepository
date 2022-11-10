package TASKS._03_CSSSELECTOR;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// 1) Bu siteye gidin. -> https://www.snapdeal.com/

       // 2) "teddy bear" aratın ve  Search butonuna tıklayın.
//
       // 3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
       // Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

public class _03 extends BaseDriver {
    @Test
    public void Test3(){

        driver.get("https://www.snapdeal.com/");

        WebElement search=driver.findElement(By.cssSelector("input[id*='inputValEnter']"));
        MyFunc.Bekle(1);
        search.sendKeys("teddy bear");
        MyFunc.Bekle(1);
        WebElement searchButton=driver.findElement(By.cssSelector("span[class*='searchTextSpan']"));
        MyFunc.Bekle(1);
        searchButton.click();
        WebElement ss=driver.findElement(By.cssSelector("[id='searchMessageContainer'] > div > span"));
        Assert.assertTrue(ss.getText().contains("We've got 242 results for teddy bear"));

        driverBekleKapat();

    }
}
