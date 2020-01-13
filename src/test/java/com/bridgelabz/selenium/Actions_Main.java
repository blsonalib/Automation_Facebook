package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_Main {

    WebDriver driver;

    @BeforeTest
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/IdeaProjects/Selenium_Testing/Driver/chromedriver_linux64 (1)/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterTest
    void quit(){
        driver.quit();
    }
}