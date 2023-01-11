package tests.day19_CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;
import static org.testng.AssertJUnit.*;
public class C01_AmazonSearch extends TestBaseCross {
    @Test
    public void test01(){
        // amazon ana sayfaya gidelim
        driver.get(ConfigReader.getProperty("amazonUrl"));
        // nutella için arama yapalım
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // sonucların nutella içerdiğini test edelim
        WebElement sonucYazisiElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
    String actualSonucYazizisi=sonucYazisiElementi.getText();
    String  expectedKelime="Nutella";
       assertTrue(actualSonucYazizisi.contains(expectedKelime));

    }
}
