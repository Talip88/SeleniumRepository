package TASKS._01_ID;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru3 {
    public static void main(String[] args) {
        //3-
        //1) Bu siteye gidin. -> https://www.snapdeal.com/
        //
        //2) "teddy bear" aratın ve  Search butonuna tıklayın.
        //
        //3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        //Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        WebElement search= driver.findElement(By.id("inputValEnter"));
        MyFunc.Bekle(2);
        search.sendKeys("teddy bear");
        MyFunc.Bekle(2);
        WebElement searchButton=driver.findElement(By.className("searchformButton"));
        System.out.println("searchButton.getText() = " + searchButton.getText());
        MyFunc.Bekle(2);
        searchButton.click();



    }
}
