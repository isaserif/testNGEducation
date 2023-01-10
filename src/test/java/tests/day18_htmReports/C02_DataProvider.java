package tests.day18_htmReports;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import static org.testng.AssertJUnit.*;
public class C02_DataProvider {
    @DataProvider
    public static Object[][] AmazonAranacakKelimeler(){

        Object[][] amazonAranacaKelimeArr={{"Nutella"},{"Java"},{"Samsung"},{"armut"}};


        return amazonAranacaKelimeArr;
    }
    // amazon gidelim
    // Nutella,Java,Samsung,armut kelimeleri için arama yapalım
    // sonucların bu kelimelerin içerdiğini test edelim


    @Test(dataProvider="AmazonAranacakKelimeler")
    public void aramaTest(String aranacakKelime){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);
        String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        assertTrue(actualSonucYazisi.contains(aranacakKelime));

    }
}
