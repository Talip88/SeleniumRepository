package TASKS._01_ID;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru4 {
    public static void main(String[] args) {
        //4-
        //Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        //Calculate'e tıklayınız.İlk input'a herhangi bir sayı giriniz.
        // İkinci input'a herhangi bir sayı giriniz.Calculate button'una tıklayınız.
        //Sonucu alınız.
        //Sonucu yazdırınız.

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        MyFunc.Bekle(2);

        WebElement calculate=driver.findElement(By.id("calculate"));
        calculate.click();
        MyFunc.Bekle(2);

        WebElement number1Input=driver.findElement(By.id ("number1"));
        number1Input.sendKeys("5");
        MyFunc.Bekle(2);

        WebElement number2Input=driver.findElement(By.id ("number2"));
        number2Input.sendKeys("8");
        MyFunc.Bekle(2);

        WebElement calculateClick=driver.findElement(By.id("calculate"));
        calculateClick.click();
        MyFunc.Bekle(2);

        WebElement answer=driver.findElement(By.id("answer"));
        System.out.println("answer="+answer.getText());


        MyFunc.Bekle(8);
        driver.quit();



    }
}
