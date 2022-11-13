package Mentoring;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends BaseDriver {
    @Test
    public void Test1(){

            driver.get("https://accounts.lambdatest.com/login");


            //*--->  tüm taglerde ara demek


            //     XPATH te sıralamadan eleman bulma    (//input)[3]
            //tagname[@attribute='value']
            WebElement emailInput=driver.findElement(By.xpath("//input[@name='email']"));

            //tagname[contains(@attribute,'partial value of attribute')]
            WebElement emailInput2=driver.findElement(By.xpath("//input[contains(@class,'form-control')]"));

            //input[@id='login_1' OR @name='login']
            WebElement emailInput3=driver.findElement(By.xpath("//input[@type='email' AND @name='email']"));
            WebElement emailInput4=driver.findElement(By.xpath("//input[@type='email' OR @name='email']"));

            //tagname[starts-with(@attribute, 'starting name of the attribute value')]
            WebElement passwordInput= driver.findElement(By.xpath("//input[starts-with(@name, 'pass')]"));

            emailInput.sendKeys("Hello");
            MyFunc.Bekle(2);
            driver.navigate().to("https://accounts.lambdatest.com/register");
            MyFunc.Bekle(2);

            //div[text()='Logged In']

            WebElement signUp=driver.findElement(By.xpath("//button[text()='FREE SIGN UP']"));
            signUp.click();

            // Xpath de //button[text()='FREE SIGN UP'] ile //button[.='FREE SIGN UP'] eşit..Ancak button olarak belirtmen önemli yoksa fazla çıkabiir




            //XPath'de //input kardeşleri yoksa //input [4] işe yaramaz.  Ancak (//input)[4] dersek inputlardan 4.sü olarak arayabilir.





            //BIR PNG yani IMG locate etme
            //XPATH ile ------>>    img[contains(@src,'thumbnailImage2122_20221104103149)]
            // bir img ı bu şekilde locate edebiliriz. Değişmeyen adından yakaladık





            //---------------Child--Sibling-------------------------------------------------------------

            WebElement fullNameInput=driver.findElement(By.xpath("(//button[text()='FREE SIGN UP']/../..//div//input)[1]"));
            fullNameInput.sendKeys("Merhaba");
            driverBekleKapat();

            //---> //button[text()='FREE SIGN UP']/../..//input
            //---> //button[text()='FREE SIGN UP']/../../following-sibling::div        /  altındaki çocuktan kardeşi
            //---> //button[text()='FREE SIGN UP']/../..//following-sibling::div------>// altındaki çocuklardan kardeşi--bütün çocukların arasında arar // ilkine gider



    }
}
