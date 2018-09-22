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
        if(System.getProperty("os.name").contains("Mac OS X")){
            driver.get("http://www.facebook.com");
            System.out.println("get title of page"+driver.getTitle());
        }else{
            driver.get("http://ec2-34-216-131-98.us-west-2.compute.amazonaws.com:8080/helloWorld-1.0.0");
            System.out.println("get title of page"+driver.getTitle());
        }

        driver.quit();
    }

}








