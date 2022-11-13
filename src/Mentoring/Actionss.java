package Mentoring;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionss extends BaseDriver {

    @Test

    public void Test1(){
//bir yerde build ile ilgili birşey görürsek builder design pattern vardır. Yani arka arkaya işlem sıralayabiliriz.
        //aksiyonlarda ardarda click.send gibi actionları sıralayabilmemizi sağlıyor builder pattern

        {
            driver.get("https://www.browserstack.com/");

            WebElement element = driver.findElement(By.id("doubleClickBtn"));
            MyFunc.Bekle(2);

            Actions aksiyonlar=new Actions(driver); // sınıf oluşturma
            Action aksiyon=aksiyonlar.moveToElement(element).doubleClick().build(); //aksyion hazırlama
            aksiyon.perform(); // action




            MyFunc.Bekle(2);

            //new Actions(driver).moveToElement(element).doubleClick().build().perform();

 //************************//ACTION SCROLL YAPMA--EKRANI KAYDIRMA*********************************************************************

            ((JavascriptExecutor)driver).executeScript("scroll(0,300)"); //JAVASCRİPT İLE SCROLL
            MyFunc.Bekle(2);


            Actions action=new Actions(driver);
            action.scrollByAmount(0,300).perform();  //JAVA ILE SCROLL

//************************//ACTION SCROLL YAPMA*********************************************************************




        }
    }
}
