package TASKS._01_ID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru1 {
    public static void main(String[] args) {

        //1.Sorunun Cevabı

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://demoqa.com/text-box");

        WebElement FullName=  driver.findElement(By.id("userName"));
        Bekle(2);
        FullName.sendKeys("Automation");
        System.out.println("FullName.getText() = " + FullName.getText());
        Bekle(2);

        WebElement email=driver.findElement (By.id("userEmail"));
        Bekle(2);
        email.sendKeys("Testing@gmail.com");
        System.out.println("email.getText() = " + email.getText());
        Bekle(2);

        WebElement currentAdress=driver.findElement(By.id("currentAddress"));
        Bekle(2);
        currentAdress.sendKeys("Testing Current Address");
        System.out.println("currentAdress.getText() = " + currentAdress.getText());
        Bekle(2);

        WebElement permanentAdress=driver.findElement (By.id("permanentAddress"));
        Bekle(2);
        permanentAdress.sendKeys("Testing Permanent Address");
        System.out.println("permanentAdress.getText() = " + permanentAdress.getText());
        Bekle(2);

        WebElement submitButton=driver.findElement(By.id("submit"));
        Bekle(2);
        System.out.println("submitButton="+submitButton.getText());
        submitButton.click();

        Bekle(2);

        driver.quit();
/*



    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

 */
    }

    public static void Bekle (int saniye)  {

        try{
            Thread.sleep(saniye*1000);

        }catch  (InterruptedException e){
            throw new RuntimeException(e);
        }
}}
