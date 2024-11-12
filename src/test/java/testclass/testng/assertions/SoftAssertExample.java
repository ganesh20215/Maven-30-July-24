package testclass.testng.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertDemo(){
        SoftAssert sf = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        sf.assertEquals(driver.getTitle(), "Facebook", "Title should be match");
        sf.assertTrue(driver.findElement(By.id("login1")).isDisplayed(), "Username textbox should be displayed");
        sf.assertAll();
        driver.close();
    }
}
