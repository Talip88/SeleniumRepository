package TASKS._04_XPATH;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.JsonToWebElementConverter;

//3-
//1) Bu siteye gidin. -> https://www.snapdeal.com/
//
//2) "teddy bear" aratın ve  Search butonuna tıklayın.
//
//3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

public class _03 extends BaseDriver {

@Test
    public void Test3(){

    driver.get("https://www.snapdeal.com/");

    WebElement tedyBear=driver.findElement(By.xpath("//*[@id='inputValEnter']"));
    tedyBear.sendKeys("teddy bear");
    MyFunc.Bekle(1);

    WebElement search=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
    search.click();
    MyFunc.Bekle(1);


    WebElement controlTrue=driver.findElement(By.xpath("//div[@class='seach-msg-sec clearfix']"));

    Assert.assertTrue(controlTrue.getText().contains("We've got 242 results for teddy bear"));

    driverBekleKapat();

}

}
