package Gun08_SelectClass_DropDownMenu;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_Soru_Cozum2 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();
        MyFunc.Bekle(2);
        WebElement cookiesAccept = driver.findElement(By.xpath("//*[text()='Allow essential and optional cookies']"));
        cookiesAccept.click();

        MyFunc.Bekle(2);
        WebElement btnYeniHesap = driver.findElement(By.linkText("Create New Account"));
        btnYeniHesap.click();

        MyFunc.Bekle(1);
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("ismet");

        MyFunc.Bekle(1);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("temur");

        //FACEBOOK DA EMAİL GİRİNCE ORTAYA ÇIKAN HİDDEN ELEMENT CLASSINI NASIL BULURUM?
        //BURADA GİRİLMEDİĞİNDE ÇIKMIYOR 1.TEST
        //GİRİLDİĞİNDE ÇIKIYOR 2.TEST

        //1.YONTEM

        // #fullname_field+div+div    -> WebElementi buldu, getattribute ile Class controlü yaptı
        //görünmüyor

        WebElement hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertTrue("Email girmeden önce gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));

        MyFunc.Bekle(1);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismet@hotmail.com");

        //görünüyor

        hiddenElement=driver.findElement(By.cssSelector("#fullname_field+div+div"));
        Assert.assertFalse("Email girdikten sonra gizli durumu", hiddenElement.getAttribute("class").equals("hidden_elem"));

        MyFunc.Bekle(1);
        WebElement email2=driver.findElement(By.name("reg_email_confirmation_")); //2.EMAİL GİRDİK
        email2.sendKeys("ismet@hotmail.com");

        WebElement day=driver.findElement(By.id("day"));
        Select dropDownDay=new Select (day);
        dropDownDay.selectByValue("4");

        MyFunc.Bekle(1);

        WebElement month=driver.findElement(By.id("month"));
        Select dropDownmonth=new Select (day);
        dropDownmonth.selectByValue("10");

        MyFunc.Bekle(1);

        WebElement year=driver.findElement(By.id("year"));
        Select dropDownyear=new Select (day);
        dropDownyear.selectByValue("1988");


//**********************************************************************************************************************
       /* //2.YONTEM

        List<WebElement> secondEmail=driver.findElements(By.cssSelector("[id='reg_form_box'] > [class='hidden_elem']"));

        Assert.assertTrue("MAil görünüyor mu?=",secondEmail.size()==1);

        MyFunc.Bekle(1);
        WebElement emaill=driver.findElement(By.name("reg_email__"));
        emaill.sendKeys("ismet@hotmail.com");

        Assert.assertTrue("MAil görünüyor mu?=",secondEmail.size()==0);
*/
       driverBekleKapat();
    }
}
