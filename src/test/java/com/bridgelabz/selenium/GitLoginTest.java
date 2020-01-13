package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Date;

public class GitLoginTest extends GitLoginFormMain{
    String url = "https://github.com/login";
    @Test(priority = 1)
    public void logIn() throws InterruptedException {
        driver.get(url);
        WebElement email = driver.findElement(By.name("login"));
        email.sendKeys("blsonalib");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("bridgelabz19");
        WebElement login = driver.findElement(By.name("commit"));
        login.click();
        Thread.sleep(2000);

    }
    @Test(priority = 2)
    public void logOut() throws InterruptedException {
        driver.get(url);
        WebElement but = driver.findElement(By.xpath("//summary[@class='Header-link']//img[@class='avatar']"));
        but.click();
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.xpath("//button[@class='dropdown-item dropdown-signout']"));
        logout.click();
    }
}
