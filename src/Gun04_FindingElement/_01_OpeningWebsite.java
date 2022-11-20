package Gun04_FindingElement;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/Utility/chromedriver.exe");
        WebDriver driver = new ChromeDriver();   // web sayfasını kontrol eden görevli
        driver.get("https://www.techno.study/"); // web sayfasını aç


        //DRIVER METOTLARI

        //driver.getTitle()---> içinde olduğu sayfayı getirir.
        //driver.getCurrentUrl();--> içinde bulunduğu sayfanın url si
        //driver.getPageSource();---->Bir web sitesinin görünür yüzünün arkasındaki kodları verir. CTRL U da sayfanın kaynak kodunu verir
        //driver.getWindowHandle();--->sayfanın (windowun) uniq ıd sini verir. her açıldığında yeni bir hash kodu olur
        //driver.getWindowHandles(); birden fazla tabın h kodlarını döndürür.
        //driver.navigate().to("URL yazılır"); get sadece gider ancak navigate ile ileri geri yapabilirsin
        //driver.navigate().back();--> to ile gidilen sayfadan önceki sayfaya gider.
        //driver.navigate().forward(); dönüldükten sonraki sayafaya geri dönüş yapar dönülen sayfaya
        //driver.navigate().refresh();---> sayfayı yeniler
        //driver.close();---> içinde bulunduğu tabı kapatır
        //driver.quit(); ---> birden fazla tabı kapatır
        //driver.manage().window().getSize();---> içinde bulunulan sayfanın ölçülerini getirir.SOUT ile yazdırırsın.. pixel olarak ölçüyü döndürür.
        //driver.manage().window().getPosition()-->açılan pencere hangi pixel nokrasından başlar.. SOL ALT KÖŞEDEN BAŞLAR SELENİUM..sol alttan sağa ve yukarı doğru kaç pixel gibi

        //driver.manage().window().setPosition( new Point(15,15)); --->
        //driver.manage().window().getSize(new Dimension( 900,600));---> içinde olduğu sayfanın sol alt köşesini içine yazacağımız pixel noktasına getirir.
        //driver.manage().window().maximize();  --->ekranı buyutme
        //driver.manage().window().fullscreen();---ekranı full screen yapma


        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));--->sayfanın weblementlerini bulması iin verilen süre...


        //ARAMA CUBUGUNA SENDKEYS ile gönderdiğin stringi submit diyerek entera basmış gibi olursun
        //aramaKutusu.submit();  //ENTER


        MyFunc.Bekle(5);
        driver.quit();
    }
}
