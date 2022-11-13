package TASKS._08_SCROLL;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


public class _03_Senario extends BaseDriver {

    // 3- Senaryo
    // 1- google.com ile sayfayı açınız.
    // 2- Daha sonra Yeni bir TAB (ctrl+T) açınız.
    // 3- Bu açılan yeni sayfada facebook.com u açınız.
    // 4- Bu sayfanın açıldığını URL sinden kontrol ediniz.
    // 4- Daha sonra facebook.com sayfasını kapatınız.
    @Test

    public void Test() throws AWTException {

        String url1 = "https://www.google.com/";
        String url2 = "https://www.facebook.com/";
        driver.get(url1);
        String firstWindowHandle = driver.getWindowHandle();
        Robot rbt = new Robot();
        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_T);

        List<String> windows= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        driver.navigate().to(url2);

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));

        driver.close();

        driverBekleKapat();


        /*

        driver.get("https://www.google.com/");

        MyFunc.Bekle(1);

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(1);

        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds.size());
        for (String id : windowIds) {
            if (driver.switchTo().window(id).getCurrentUrl().contains("facebook")){

            MyFunc.Bekle(2); driver.close();
            }
        }

 */
            }
        }














