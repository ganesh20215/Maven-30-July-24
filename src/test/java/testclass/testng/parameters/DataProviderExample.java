package testclass.testng.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "testcheck")
    public Object[][] testData(){
        return new Object[][] {
                {"Java", "Delhi"},
                {"Selenium", "Mumbai"},
                {"API Testing", "Pune"}
        };
    }

    @Test(dataProvider = "testcheck")
    public void verifyGoogleSearchDemo(String courseName, String cityName) throws InterruptedException {
        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
