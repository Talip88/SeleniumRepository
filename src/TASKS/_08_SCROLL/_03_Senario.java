package TASKS._08_SCROLL;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _03_Senario extends BaseDriver {
    // 3-
    //         Senaryo
    // 1- google.com ile sayfayı açınız.
    // 2- Daha sonra Yeni bir TAB (ctrl+T) açınız.
    // 3- Bu açılan yeni sayfada facebook.com u açınız.
    // 4- Bu sayfanın açıldığını URL sinden kontrol ediniz.
    // 4- Daha sonra facebook.com sayfasını kapatınız.
    @Test

    public void Test() throws AWTException {

    driver.get("https://www.google.com/");
        MyFunc.Bekle(2);

        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        MyFunc.Bekle(1);

        rbt.keyRelease(KeyEvent.VK_TAB);
        MyFunc.Bekle(2);




        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar
            //    .moveToElement(element)   // kutucuğa git
                .click()   // kutucuğa tıkla
                .keyDown(Keys.LEFT_SHIFT)  // keylerden SHIFT'i seç
                .sendKeys("a")  // tuşlardan a'ya bas
                .keyUp(Keys.SHIFT)  //keylerden SHIFT'i bırak
                .sendKeys("hmet")  //istediğin kelimeleri yaz
                .build(); //bu durumu hazırla.

        MyFunc.Bekle(2);

        aksiyon.perform();  // yukarıdaki durumu işleme dök.
    }
}
