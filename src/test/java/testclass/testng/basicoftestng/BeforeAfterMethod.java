package testclass.testng.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    public static WebDriver driver;

    @BeforeMethod
    public void preRequsite(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testCheckForFacebook(){
        driver.get("http://www.facebook.com");
    }
    @Test
    public void testCheckForAmazon(){
        driver.get("http://www.amazon.in");
    }

    @Test
    public void testCheckForGoogle(){
        driver.get("http://www.google.com");
    }

    @AfterMethod
    public void postRequsite(){
        driver.close();
    }
}
