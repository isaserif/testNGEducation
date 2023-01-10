package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {
/*
testng test methodlarını isim sırasına göre çalıştırır
priority değeri verilen methodlar priority kucukte buyuğe doğru calışır
 */
   @Test(priority = 6)
   public void ilkTest() {
       System.out.println("ilk test started");
   }
    @Test(priority = 9)
   public void ikinciTest() {
       System.out.println("2. test started");
   }
    @Test (priority =44)
   public void ucuncuTest() {
       System.out.println("3. test started");
   }





}
