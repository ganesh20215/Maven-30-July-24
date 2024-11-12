package testclass.testng.basicoftestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1, enabled = true, groups = {"sanity"})
    public void testCase_Z(){
        System.out.println("Test Case Z");
    }

    @Test(priority = 2, groups = {"smoke"})
    public void testCase_D(){
        System.out.println("Test Case D");
    }

    @Test(priority = -1, groups = {"sanity"})
    public void testCase_E(){
        System.out.println("Test Case E");
    }

    @Test(priority = 0, groups = {"smoke"})
    public void testCase_B(){
        System.out.println("Test Case B");
    }

    @Test(priority = 'A')
    public void testCase_A(){
        System.out.println("Test Case A");
    }
}
