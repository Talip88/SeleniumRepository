//package TASKS.ODEVCEVAPLARI.Selenium_Css_Xpath_Odev.Soru_01_;
//
//
//import Utils.BaseStaticDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.junit.Assert;
//
//public class demoqaCom extends BaseDriver {
//
//          /* 1-
//        1) Bu siteye gidin. ->  http://demoqa.com/text-box
//        2) Full Name kısmına "Automation" girin.
//        3) Email kısmına "Testing@gmail.com" girin.
//        4) Current Address kısmına "Testing Current Address" girin.
//        5) Permanent Address kısmına "Testing Permanent Address" girin.
//        6) Submit butonuna tıklayınız.
//        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
//     */
//        public static void main(String[] args)  {
//
//            driver.get("http://demoqa.com/text-box");
//
//           // WebElement userName = driver.findElement(By.cssSelector("input#userName"));
//            WebElement userName = driver.findElement(By.xpath("//*[@id='userName']"));
//            userName.sendKeys("Automation");
//            Utils.MyFunc.Bekle(2);
//
//            //WebElement userEmail = driver.findElement(By.cssSelector("input[class='mr-sm-2 form-control']"));
//            WebElement userEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
//            userEmail.sendKeys("Testing@gmail.com");
//            Utils.MyFunc.Bekle(2);
//
//           // WebElement currentAddress = driver.findElement(By.cssSelector("textarea.form-control#currentAddress"));
//            WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
//            currentAddress.sendKeys("Testing Current Address");
//            Utils.MyFunc.Bekle(2);
//
//            //WebElement permanentAddress = driver.findElement(By.cssSelector("textarea[id*='permanent']"));
//            WebElement permanentAddress = driver.findElement(By.xpath("(//*[contains(@id,'permanent')])[3]"));
//            permanentAddress.sendKeys("Testing Permanent Address");
//            Utils.MyFunc.Bekle(2);
//
//           // WebElement submit = driver.findElement(By.cssSelector("button#submit"));
//            WebElement submit = driver.findElement(By.xpath("//button[@id='submit' and @type='button']"));
//            submit.click();
//            Utils.MyFunc.Bekle(2);
//
//
//           // WebElement name = driver.findElement(By.cssSelector("p#name"));
//            WebElement name = driver.findElement(By.xpath("//p[@id='name']"));
//           // WebElement email = driver.findElement(By.cssSelector("p.mb-1#email"));
//            WebElement email = driver.findElement(By.xpath("//p[@id='email']"));
//
//
//          Assert.assertTrue(name.getText().contains("Automation"));
//          Assert.assertTrue(email.getText().contains("Testing"));
//
//            driverBekleKapat();
//        }
//    }
//
//