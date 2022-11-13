package TASKS._08_SCROLL;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;

public class _01_Senario extends BaseDriver {
    @Test
    public void Test1(){

      // Senaryo
      // 1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
      // 2- random 100 e kadar 2 sayı üretiniz.
      // 3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
      // 4- Sonuçları Assert ile kontrol ediniz.
      // 5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        MyFunc.Bekle(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("calcForm"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        for (int i = 1; i <5 ; i++) {

        WebElement sayi1=driver.findElement(By.cssSelector("[id='number1Field']"));
        int uretilen1=  (int)(Math.random() * 100);
        String uretilenStr1=Integer.toString(uretilen1) ;
        MyFunc.Bekle(1);
        sayi1.sendKeys(uretilenStr1);

        int uretilen2=  (int)(Math.random() * 100);
        String uretilenStr2=Integer.toString(uretilen2) ;
        MyFunc.Bekle(1);

        WebElement sayi2=driver.findElement(By.cssSelector("[id='number2Field']"));
        sayi2.sendKeys(uretilenStr2);

        WebElement webMenu=driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
        Select ddMenu= new Select(webMenu);
        ddMenu.selectByIndex(0);

        WebElement calculateAdd=driver.findElement(By.cssSelector("input[id='calculateButton']"));
        calculateAdd.click();

        WebElement answer=driver.findElement(By.xpath("//*[@id='numberAnswerField']"));
        Assert.assertEquals(answer.getAttribute("value"), Integer.toString(uretilen1+uretilen2));

        WebElement clear=driver.findElement(By.cssSelector("[id='clearButton']"));
        clear.click();

        MyFunc.Bekle(2);

        WebElement webMenu2=driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
        Select ddMenu2= new Select(webMenu2);
        ddMenu2.selectByIndex(1);

        WebElement CalculateSubstract=driver.findElement(By.cssSelector("input[id='calculateButton']"));
        CalculateSubstract.click();

        Assert.assertEquals(answer.getAttribute("value"), Integer.toString(uretilen1-uretilen2));

        MyFunc.Bekle(2);

        WebElement clear2=driver.findElement(By.cssSelector("[id='clearButton']"));
        clear2.click();

        WebElement webMenu3=driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
        Select ddMenu3= new Select(webMenu3);
        ddMenu3.selectByIndex(2);

        WebElement CalculateMultiply=driver.findElement(By.cssSelector("input[id='calculateButton']"));
        CalculateMultiply.click();

        Assert.assertEquals(answer.getAttribute("value"), Integer.toString(uretilen1*uretilen2));

        MyFunc.Bekle(2);

        WebElement clear3=driver.findElement(By.cssSelector("[id='clearButton']"));
        clear3.click();

        WebElement webMenu4=driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
        Select ddMenu4= new Select(webMenu4);
        ddMenu4.selectByIndex(3);

        WebElement clickMenu=driver.findElement(By.cssSelector("[id='integerSelect']"));
        clickMenu.click();

        WebElement CalculateDivide=driver.findElement(By.cssSelector("input[id='calculateButton']"));
        CalculateDivide.click();

        MyFunc.Bekle(2);

        WebElement clear4=driver.findElement(By.cssSelector("[id='clearButton']"));
        clear4.click();

        WebElement webMenu5=driver.findElement(By.cssSelector("[id='selectOperationDropdown']"));
        Select ddMenu5= new Select(webMenu5);
        ddMenu5.selectByIndex(4);

        WebElement CalculateConcatenate=driver.findElement(By.cssSelector("input[id='calculateButton']"));
        CalculateConcatenate.click();

        Assert.assertEquals(answer.getAttribute("value"), Integer.toString(uretilen1+uretilen2));

        MyFunc.Bekle(2);

        WebElement clear5=driver.findElement(By.cssSelector("[id='clearButton']"));
        clear5.click();

            sayi1.clear();
            sayi2.clear();

        }
    }
}
