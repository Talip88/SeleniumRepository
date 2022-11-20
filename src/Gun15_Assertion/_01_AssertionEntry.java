package Gun15_Assertion;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;

public class _01_AssertionEntry extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://wwww.automationtesting.co.uk");

        String pageTitle=driver.getTitle();
        Assert.assertEquals("expected", "actual");

        Assert.assertEquals("Homepage", pageTitle);
        String actuallStr="lakdnaşkda";


       // Assert.assertTrue(actuallStr.contains(expectedString)); 0 sorunsuz -1 sorunludur. sorun olursa -1 verir java bize test  failed olur

        //ASSERTION METOTLARI BIZE VERILEN TEST SENARYOSUNA GORE KULLANILIR

        //1-Assert.assertTrue(kosul)----Sonucun Nutella içerdiğini test edin (koşul---)str.contains("nutella") gibi
        //2-Assert.assertFalse(kosul)---Sonucun Kutella içermediğini test edin dediğinde assertFalse
        //3-Assert.assertEqual(expected, kosul)---sonuc yazsının şu olduğu test edin


        //1- int aliYas=56;
        //2- int veliyas=68;
        //3- int emeklilikYAsi=65;

        //Velinin emekli olabileceğini test edin
        //Assert.assertTrue(veliYas>emeklilikYasi)--TEST PASSED

        //Ali'nin emekli olamayacağını test edin
        //Assert.assertFalse(aliYas>emeklilikYas);-----TEST PASSED

        //Emekli yaşının 65 olduğunu test edin
        //Assert.assertEquals(65, emeklilikYas);-----TEST PASSED


        //ALi'nin emekli olabileceğini test edin
        //Assert.assertTrue(ALininYasi>EmeklilikYas)----TEST FAİLED

        ////Velinin emekli olamayacagını test edin
        ////Assert.assertFalse(veliYas>emeklilikYasi)----Test FAİLED

        //Emeklilik yaşının 63 olduğunu test edin------Test FAİLED
        //Assert.assertEqual(63,emeklilikYas)





    }
}
