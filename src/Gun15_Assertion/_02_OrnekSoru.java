package Gun15_Assertion;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_OrnekSoru extends BaseDriver {
    @Test
    public void Test(){

        //1-ANASAYFAYA GİTTİĞİNİ TEST EDİN

        driver.get("https://automationexercise.com");

        //2-WebSayfasının ana sayfasındaki 1 webelementi locate et. Bu element görünüyor mu?

        WebElement element=driver.findElement(By.xpath("img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(element.isDisplayed());

        //3-Login accounta gir
        WebElement login=driver.findElement(By.xpath("/static/images/home/logo.png"));
        login.click();

        //4-Login account yazısının göründüğünü test et
        WebElement loginYazisi=driver.findElement(By.xpath("Login to your account"));
        Assert.assertTrue(loginYazisi.isDisplayed());

        //5-Kuulanıcı adının görünür olduğunu test et Assert.assertTrue(login.isDisplayed());


        //ANAYSAYFAYA GELMİŞ Mİ TESTİ

        //String=expectedURL="https://automationexercise.com/login");
        //String actualURL=driver.getCurrentURL();
        //Assert.assertEquals(expectedURL,actualURL);

    }
}
