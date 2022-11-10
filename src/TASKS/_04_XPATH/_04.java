package TASKS._04_XPATH;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//4-
//Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//Calculate'e tıklayınız.
//         İlk input'a herhangi bir sayı giriniz.
//         İkinci input'a herhangi bir sayı giriniz.
//Calculate button'una tıklayınız.
//Sonucu alınız.
//Sonucu yazdırınız.
public class _04 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate=driver.findElement(By.xpath("//*[@id='calculate']"));
        calculate.click();
        MyFunc.Bekle(1);

        WebElement number1=driver.findElement(By.xpath("//*[@id='number1']"));
        number1.sendKeys("98");
        MyFunc.Bekle(1);

        WebElement number2=driver.findElement(By.xpath("//*[@id='number1']"));
        number2.sendKeys("99");
        MyFunc.Bekle(1);

        WebElement calc2=driver.findElement(By.xpath("//*[@id='calculate']"));
        calc2.click();
        MyFunc.Bekle(1);

        WebElement write=driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("write.getText() = " + write.getText());

        driverBekleKapat();



    }
}
