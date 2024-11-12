package testclass.testng.failscripts;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class FailScriptsExecutions {

    @Test
    public void testCase_1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase_2(){
        Assert.assertTrue(false);
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase_3(){
        Assert.assertTrue(false);
        System.out.println("Test Case 3");
    }

    @Test
    public void testCase_4(){
        System.out.println("Test Case 4");
    }

    @Test
    public void testCase_5(){
        System.out.println("Test Case 5");
    }
}
