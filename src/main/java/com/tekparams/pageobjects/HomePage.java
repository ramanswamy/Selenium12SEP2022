package com.tekparams.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebElement email;
    public WebElement password;
    public WebElement login;

    public WebElement email(WebDriver driver){
        email=driver.findElement(By.id("email"));
        //email=driver.findElement(By.name("email"));
        //email=driver.findElement(By.xpath(//input[@id=”email“]));
        return email;
    }
    public WebElement password(WebDriver driver){
        password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
        return password;
    }
    public WebElement login(WebDriver driver){
        login=driver.findElement(By.xpath("//button[contains(text(),\"Login\")]"));
        return login;
    }
}
