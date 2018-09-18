package TestFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Testclass {
    @Test
    public void testFireFox(){

        WebDriver driver=null;

       if(System.getProperty("os.name").contains("Mac OS X")){
           System.setProperty("webdriver.chrome.driver","/Users/venkateshkoyyalamudi/Downloads/chromedriver");
           driver= new ChromeDriver();
       }else{
           System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.addArguments("--headless");
           chromeOptions.addArguments("--no-sandbox");
           driver= new ChromeDriver(chromeOptions);
       }
        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");

        driver.quit();
    }

}








