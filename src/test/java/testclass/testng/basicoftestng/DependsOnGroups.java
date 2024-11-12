package testclass.testng.basicoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {

    @Test(groups = {"smoke"})
    public void verifyAddToCard(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyProductDelivery(){
        System.out.println("Verify Transactions");
    }

    @Test
    public void verifySearchProduct(){
        System.out.println("Verify Onboard New User");
    }
}
