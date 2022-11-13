package Selenium_Css_Xpath_Odev.Soru_03_;

import Utils.BaseStaticDriver;
import Utils.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class snapDealCom extends BaseStaticDriver {
    /*
        3-
        1) Bu siteye gidin. -> https://www.snapdeal.com/
        2) "teddy bear" aratın ve  Search butonuna tıklayın.
        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 253 results for teddy bear)
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
     */
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

       // WebElement inputValEnter = driver.findElement(By.cssSelector("input[name='keyword'][class*='keyword']"));
        WebElement inputValEnter = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
        inputValEnter.sendKeys("teddy bear");
        MyFunc.Bekle(2);

       // WebElement searchformButton = driver.findElement(By.cssSelector("span.searchTextSpan"));
        WebElement searchformButton = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        searchformButton.click();
        MyFunc.Bekle(2);

       // WebElement nnn = driver.findElement(By.cssSelector("span.nnn"));
        WebElement nnn = driver.findElement(By.xpath("(//span[@class='nnn'])[1]"));

        Assert.assertTrue(nnn.getText().contains("We've got 253 results for teddy bear"));


        driverBekleKapat();
    }
}
