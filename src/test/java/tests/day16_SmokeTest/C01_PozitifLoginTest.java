package tests.day16_SmokeTest;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.*;

public class C01_PozitifLoginTest {

@Test
    public void pozitifLoginTest(){

    // qualtydemy anasayfaya gidin
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    qualitydemyPage.ilkLoginLinki.click();

    qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
    qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

    qualitydemyPage.loginButonu.click();
    ReusableMethods.bekle(2);

    assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
    Driver.closeDriver();
}

}
