package TASKS.Projects;

import Utility.BaseDriver;

import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_Akakce extends BaseDriver {
    //1. https://www.akakce.com/ sitesinde bir hesap açınız,
    //2. Sitenin açılıp açılmadığını kontrol ediniz,
    // *** E-posta için gerçek bir hesap olmasına gerek yok
    // *** Şifre 8 karakterli büyük , küçük harf ve rakam içermelidir
    //3. Hesap açma işlemi tamamlandıktan sonra doğru hesabın açılıp açılmadığını
    //kontrol ediniz.
    //4. Profil sayfanızı açınız ve Siparişlerim butonuna tıklayınız
    //5. Siparişinizin olmadığını doğrulayınız,
    //6. Profil sayfanızı açınız ve Mesajlarım butonuna tıklayınız
    //7. Mesajınızın olmadığını doğrulayınız
    //8. Ana sayfaya tekrar dönün,
    //9. Hesabınızı silmek için gerekli adımları uygulayınız.
    //Not: Lütfen Gerçek MAİL adresinizi kullanmayınız

    @Test

    public void Test()
    {
        driver.get("https://www.akakce.com/");

        WebElement hesapAc=driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[1]"));
        hesapAc.click();

        MyFunc.Bekle(1);


        String name="Hasan";
        WebElement name1=driver.findElement(By.xpath("//*[@id='rnufn' and @name='rnufn']"));
        name1.sendKeys(name);

        MyFunc.Bekle(1);

        WebElement surName=driver.findElement(By.cssSelector("span[class='frm_v8']>input[id='rnufs']"));
        surName.sendKeys("asik");

        MyFunc.Bekle(1);


        String emailGirilen="123dsd@gmail.com";
        WebElement email=driver.findElement(By.cssSelector("input[id='rnufe1']"));
        email.sendKeys(emailGirilen);

        MyFunc.Bekle(1);

        WebElement email2=driver.findElement(By.cssSelector("input[id='rnufe2']"));
        email2.sendKeys(emailGirilen);

        MyFunc.Bekle(1);

        String password="Hasan123";
        WebElement password1=driver.findElement(By.cssSelector("input[id='rnufp1']"));
        password1.sendKeys(password);

        MyFunc.Bekle(1);

        WebElement password2=driver.findElement(By.cssSelector("input[id='rnufp2']"));
        password2.sendKeys(password);

        MyFunc.Bekle(1);

        WebElement man=driver.findElement(By.cssSelector("input[id='rngm']"));
        man.click();

        MyFunc.Bekle(1);

        WebElement secim=driver.findElement(By.cssSelector("select[id='locpr']"));
        Select Menu=new Select(secim);

        Menu.selectByValue("33");

        WebElement ilce=driver.findElement(By.cssSelector("select[id='locds']"));
        Menu=new Select(ilce);
        Menu.selectByValue("413");
        MyFunc.Bekle(1);
        WebElement dogumtarihiGun=driver.findElement(By.cssSelector("select[id='bd']"));
        Menu=new Select(dogumtarihiGun);
        Menu.selectByValue("22");
        MyFunc.Bekle(1);
        WebElement dogumTarihiAy=driver.findElement(By.cssSelector("select[id='bm']"));
        Menu=new Select(dogumTarihiAy);
        Menu.selectByValue("6");
        MyFunc.Bekle(1);
        WebElement dogumTarihiYil=driver.findElement(By.cssSelector("select[id='by']"));
        Menu=new Select(dogumTarihiYil);
        Menu.selectByValue("1995");
        MyFunc.Bekle(1);
        WebElement sozlesme=driver.findElement(By.cssSelector("input[id='rnufpca']"));
        sozlesme.click();
        MyFunc.Bekle(1);
        WebElement bildirim=driver.findElement(By.cssSelector("input[id='rnufnee']"));
        bildirim.click();
        MyFunc.Bekle(1);
        WebElement hesapKayit=driver.findElement(By.cssSelector("input[id='rfb']"));
        hesapKayit.click();
        MyFunc.Bekle(1);
        // isim bolumunu namee degiskenine tanimlayarak test verisi degisse bile calismasini sagladik
        WebElement hasan=driver.findElement(By.xpath("//*[text()='"+name+"']"));
        hasan.click();
        MyFunc.Bekle(1);
        WebElement siparislerim=driver.findElement(By.xpath("//*[text()='Siparişlerim']"));
        siparislerim.click();
        MyFunc.Bekle(1);
        WebElement siparisKontrol=driver.findElement(By.xpath("//*[text()='Kayıtlı siparişiniz bulunmuyor.' or @class='no-record']"));
        siparisKontrol.getText();
        MyFunc.Bekle(1);
        hasan=driver.findElement(By.xpath("//*[text()='"+name+"']"));
        hasan.click();
        MyFunc.Bekle(1);
        WebElement mesajlarim=driver.findElement(By.xpath("//*[text()='Mesajlarım']"));
        mesajlarim.click();
        MyFunc.Bekle(1);
        WebElement mesajKontrol=driver.findElement(By.xpath("//*[text()='Listelenecek mesaj bulunamadı.']"));
        mesajKontrol.getText();
        MyFunc.Bekle(1);
        WebElement anaSayfa=driver.findElement(By.cssSelector("[title='Anasayfaya gitmek için tıklayın']"));
        anaSayfa.click();
        MyFunc.Bekle(1);
        hasan=driver.findElement(By.xpath("//*[text()='"+name+"']"));
        hasan.click();
        MyFunc.Bekle(1);
        WebElement hesapSil=driver.findElement(By.xpath("//*[text()='Hesabımı Sil']"));
        hesapSil.click();
        MyFunc.Bekle(1);
        WebElement sifreGir=driver.findElement(By.xpath("//*[@onfocusout='ControlPassword();']"));
        sifreGir.sendKeys(password);
        MyFunc.Bekle(1);
        WebElement hesapSilTikla=driver.findElement(By.xpath("//*[@type='submit' and @value='Hesabımı sil']"));
        hesapSilTikla.click();

        driverBekleKapat();

    }

}
