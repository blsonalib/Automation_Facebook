package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyFB_UNandPWDfieldsAreAligned_intheSameRow {
    @Test
    public void testName() {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/IdeaProjects/Selenium_Testing/Driver/chromedriver_linux64 (1)/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        int unInYCordinate = unTB.getLocation().getY();
        System.out.println("UserName in y coordinate" + unInYCordinate);
        WebElement passTB = driver.findElement(By.id("pass"));
        int passInYCordinate = passTB.getLocation().getY();
        System.out.println("password in y coordinate" + passInYCordinate);
        WebElement loginbut = driver.findElement(By.xpath("//input[@value='Log In']"));
        int loginYcoordinate = loginbut.getLocation().getY();
        System.out.println("login in y cooridinate" + loginYcoordinate);
        if (unInYCordinate == passInYCordinate) {
            System.out.println("It is in same y coordinate");
        } else {
            System.out.println("It is not in y coordinate");
        }
    }
}

