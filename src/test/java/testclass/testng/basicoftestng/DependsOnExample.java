package testclass.testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyTransactions(){
        System.out.println("Verify Transactions test methods");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyOnboardNewUser(){
        System.out.println("Verify Onboard New User and say Good Evening..");
    }

    @Test(priority = 1, groups = {"sanity"})
    public void testCase_Z(){
        System.out.println("Test Case ABCD");
    }
}
