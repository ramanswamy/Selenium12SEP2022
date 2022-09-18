package com.tekparams.actiondriver;

import com.tekparams.base.Base;
import com.tekparams.pageobjects.DashboardPage;
import com.tekparams.pageobjects.HomePage;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class ActionDriver {
    WebDriver driver;
    String browserType="chrome";
    String url="https://acme-test.uipath.com/login";
    public WebElement element;
    String username="ramanswamy@rediffmail.com";
    String password="EKY9GJ";

    void setupApplication(){
        Base base = new Base();
        driver=base.getDriverInstance(browserType);
        driver.manage().window().maximize();
    }


    @Test
    void openApplication(){
        setupApplication();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    void loginToApplicaiton(){
        HomePage homePage=new HomePage();
        //openApplication();
        element=homePage.email(driver);
        element.sendKeys(username);
        element=homePage.password(driver);
        element.sendKeys(password);
        element= homePage.login(driver);
        element.click();
    }

    @Test
    void validateWorkItems(){
        DashboardPage dashboardPage=new DashboardPage();
        element=dashboardPage.WorkItems(driver);
        String actualResult=element.getText();
        String expectedResult="WorkItems";
        Assert.assertEquals(expectedResult,actualResult);
    }
}
