package tests.practive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AlibabaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class actionsMethod  {

static AlibabaPage alibabaPage=new AlibabaPage();
    @Test
    public void test01() {
        ////https://www.alibaba.com/
        Driver.getDriver().get(ConfigReader.getProperty("aliBabaUrl"));
        ////cookies i kabul edin veya reddedin
        ////shipto kismina giderek ulke olarak turkiye yi secelim ve kaydedelim


        ////sayfanin en altina inerek dil olarak turkceyi secelim
        ////categori kismina giderek tarim seceneginin ustune gelelim ve acilan yan sayfadan tarim ekipmanlarini secelim
        ////tekrardan ilk sayfaya gecelim
    }
}