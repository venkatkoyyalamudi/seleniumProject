package TestFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Testclass {
    @Test
    public void testFireFox(){

        System.setProperty("webdriver.chrome.driver","/Users/venkateshkoyyalamudi/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");

        driver.quit();
    }

}








