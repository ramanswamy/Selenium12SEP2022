package com.tekparams.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
    WebDriver driver;

    public WebDriver getDriverInstance(String browserType){
        switch (browserType)
        {
            case "chrome":
            {
                //ChromeOptions chromeOptions = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            }
            case "edge":
            {
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }
            case "firefox":
            {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
            }
        }
        return driver;
    }
}
