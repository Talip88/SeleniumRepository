package Selenium_Css_Xpath_Odev.Soru_04_;

import Utils.BaseStaticDriver;
import Utils.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testpagesHerokuappCom extends BaseStaticDriver { /*4-
    Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
    Calculate'e tıklayınız.
    İlk input'a herhangi bir sayı giriniz.
    İkinci input'a herhangi bir sayı giriniz.
    Calculate button'una tıklayınız.
    Sonucu alınız.
    Sonucu yazdırınız.*/
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
       // WebElement calculate = driver.findElement(By.cssSelector("a#calculate"));
        WebElement calculate = driver.findElement(By.xpath("//a[text()='Calculate']"));
        calculate.click();
        MyFunc.Bekle(2);

        //WebElement number1 = driver.findElement(By.cssSelector("input[type='text']#number1"));
        WebElement number1 = driver.findElement(By.xpath("//input[@id='number1']"));
        number1.sendKeys("101");
        MyFunc.Bekle(2);

        //WebElement number2 = driver.findElement(By.cssSelector("input#number2"));
        WebElement number2 = driver.findElement(By.xpath("//input[@name='number2']"));
        number2.sendKeys("202");
        MyFunc.Bekle(2);

       // WebElement islemYap = driver.findElement(By.cssSelector("input[value='Calculate']"));
        WebElement islemYap = driver.findElement(By.xpath("//*[@value='Calculate']"));
        islemYap.click();

        //WebElement answer = driver.findElement(By.cssSelector("span#answer"));
        WebElement answer = driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("Answer = " + answer.getText());

      driverBekleKapat();
    }
}
