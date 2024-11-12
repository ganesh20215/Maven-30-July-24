package testclass.testng.basicoftestng;

import org.testng.annotations.Test;

public class TestNGAttribute {

    @Test(invocationCount = 100000, invocationTimeOut = 1)
    public void testMethodAttribute(){
        System.out.println("Test Method Attribute");
    }
}
