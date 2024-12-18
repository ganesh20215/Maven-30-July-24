package testclass.testng.failscripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailScriptsAutomatically implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount){
            retryCount++;

            return true;
        }
        System.out.println("Hello Java");
        return false;
    }
}
