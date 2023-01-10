package tests.day14_testNGFramework;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class C02_DependsOnMethods {

    @Test
    public void ilkTest() {
        System.out.println("ilk test started");
        assertTrue(5<9);
    }
    @Test(dependsOnMethods = "ilkTest")
    public void ikinciTest() {
        System.out.println("2. test started");
    }
    @Test (dependsOnMethods = "ikinciTest")
    public void ucuncuTest() {
        System.out.println("3. test started");
    }



}
