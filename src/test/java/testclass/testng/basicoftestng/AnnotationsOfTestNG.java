package testclass.testng.basicoftestng;

import org.testng.annotations.*;

public class AnnotationsOfTestNG {

    @BeforeMethod
    public void testForBefore(){
        System.out.println("This is for Before Method");
    }

    @Test
    public void testCase_1(){
        System.out.println("Test Case 1");
    }

    @AfterMethod
    public void testForAfter(){
        System.out.println("This is for After Method");
    }

    @Test
    public void testCase_2(){
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase_3(){
        System.out.println("Test Case 3");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class Method...");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class Method...");
    }
}
