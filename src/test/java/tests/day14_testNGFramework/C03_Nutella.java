package tests.day14_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

import static org.testng.AssertJUnit.*;

public class C03_Nutella {
    @Test(groups = {"minireg1","minireg2","smoke"})
    public void test01(){
        // amazon anasayfayagidin
        Driver.getDriver().get("https://www.amazon.com");
        // nutella için arama yapın
    WebElement aramabox= Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
    aramabox.sendKeys("Nutella"+ Keys.ENTER);
        // sonucların nutella içerdiğini test edin
        WebElement aramaSonucElementi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedKelime="Nutella";
        String actualAramaSonucElementi=aramaSonucElementi.getText();
        assertTrue(actualAramaSonucElementi.contains(expectedKelime));

    Driver.closeDriver();

    }
}
