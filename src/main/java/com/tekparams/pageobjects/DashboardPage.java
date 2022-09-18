package com.tekparams.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    public WebElement WorkItems;

    public WebElement WorkItems(WebDriver driver){
        WorkItems=driver.findElement(By.xpath("//button/i[@class=\"far fa-folder-open\"]\n"));
        return WorkItems;
    }
}
