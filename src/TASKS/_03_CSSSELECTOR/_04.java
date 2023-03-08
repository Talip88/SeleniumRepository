package TASKS._03_CSSSELECTOR;

import Utility.BaseDriver;
import Utility.MyFunc;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


//4--//Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//
//Calculate'e tıklayınız.
//
//         İlk input'a herhangi bir sayı giriniz.
//
//         İkinci input'a herhangi bir sayı giriniz.
//
//Calculate button'una tıklayınız.
//
//Sonucu alınız.
//
//Sonucu yazdırınız.
public class _04 extends BaseDriver {
    @Test
    public void Test4(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);
        WebElement Calculator=driver.findElement(By.cssSelector("a[id*='calculatetest']"));
        MyFunc.Bekle(1);
        Calculator.click();
        MyFunc.Bekle(1);
        WebElement number1=driver.findElement(By.cssSelector("input[id*='number1']"));
        MyFunc.Bekle(1);
        number1.sendKeys("10");
        MyFunc.Bekle(1);
        WebElement number2=driver.findElement(By.cssSelector("input[id*='number2']"));
        MyFunc.Bekle(1);
        number2.sendKeys("8");
        MyFunc.Bekle(1);
        WebElement total=driver.findElement(By.cssSelector("input[id*='calculate']"));
        MyFunc.Bekle(1);
        total.click();
        WebElement totalWrite=driver.findElement(By.cssSelector("span[id*='answer']"));
        MyFunc.Bekle(1);
        System.out.println("Sonuç="+totalWrite.getText());
        driverBekleKapat();









    }
}
