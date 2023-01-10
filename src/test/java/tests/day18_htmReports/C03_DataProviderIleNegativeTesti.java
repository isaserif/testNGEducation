package tests.day18_htmReports;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.AssertJUnit.*;

public class C03_DataProviderIleNegativeTesti {
    @DataProvider
    public static Object[][] kullanıcıBilgileri() {

 Object[][] kullaniciBilgileriArr={{"A11","A12345"},{"B12","B12345"},{"D14","D12345"},{"C13","C12345"},{"E15","E12345"}};
        return kullaniciBilgileriArr;
    }
    //Qualtydemy anasayfaya gidin
    // verilen yanlıs kullanıcı adi ve password kombinasyonları alın
    // giris yapılmadığını test edin
    //      username            password
    //        A11                A12345
    //        B12                B12345
    //        C13                C12345
    //        D14                D12345
    //        E15                E12345
    @Test(dataProvider = "kullanıcıBilgileri")
    public void negativeLoginTest(String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
        qualitydemyPage.passwordKutusu.sendKeys(password);
        qualitydemyPage.loginButonu.click();
        assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }
}