package testclass.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in");
        driver.manage().window().maximize();
    }
}
