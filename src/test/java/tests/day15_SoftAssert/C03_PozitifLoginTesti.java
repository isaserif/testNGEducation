package tests.day15_SoftAssert;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.*;

public class C03_PozitifLoginTesti {
@Test(groups = "smoke")
    public void test01() {
    //1- https://www.qualitydemy.com/ anasayfasina gidin
Driver.getDriver().get("https://www.qualitydemy.com/");
    //2- login linkine basin
    QualitydemyPage qualitydemPage=new QualitydemyPage();
    qualitydemPage.ilkLoginLinki.click();
    //3- Kullanici email'i olarak valid email girin
    qualitydemPage.kullaniciEmailKutusu.sendKeys("user_1106147@Login.com");
    //4- Kullanici sifresi olarak valid sifre girin
    qualitydemPage.passwordKutusu.sendKeys("31488081");
    //5- Login butonuna basarak login olun
    qualitydemPage.loginButonu.click();
    //6- Basarili olarak giris yapilabildigini test edin
    assertTrue(qualitydemPage.basariliGirisCoursesLinki.isDisplayed());

    ReusableMethods.bekle(3);
    Driver.closeDriver();
}
}
