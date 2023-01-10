package tests.day18_htmReports;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
import static org.testng.AssertJUnit.*;
public class C01_Html_Reports extends TestBaseRapor {
    @Test
    public void test01(){

        extentTest=extentReports.createTest("Nutella testi","Kullanıcı amazonda Nutella aratabilmeli");

        // amazon anasayfayagidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon anasayfaya gidildi");

        // nutella için arama yapın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+Keys.ENTER);
        extentTest.info("Arama kutusuna Nutella yazıp, arama yapıldı");

        // sonucların nutella içerdiğini test edin
        String expectedKelime="Nutella";
        String actualAramaSonucElementi=amazonPage.aramaSonucuElementi.getText();
        extentTest.info("arama sonucları kaydedildi");

        assertTrue(actualAramaSonucElementi.contains(expectedKelime));
        extentTest.pass("Arama sonuclarının Nutella içerdiği test edildi");
    }
}
