package tests.day19_CrossBrowser;
import org.testng.annotations.Test;
import utilities.TestBaseCross;
import static org.testng.AssertJUnit.assertTrue;
public class C02_WisequarterTest extends TestBaseCross {
    @Test
    public void test01(){
        //wisequarter ana sayfaya gidelim
        driver.get("https://www.wisequarter.com");
        // ana sayfaya gittiğimizi test edelim
        String actualUrl= driver.getCurrentUrl();
        String expectedKelime="wisequarter";
        assertTrue(actualUrl.contains(expectedKelime));
    }
}
