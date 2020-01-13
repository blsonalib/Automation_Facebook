package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GitLoginFormMain {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/home/admin1/IdeaProjects/Selenium_Testing/Driver/chromedriver_linux64 (1)/chromedriver");
         driver = new ChromeDriver();

    }
   /* @AfterTest
    public void quit(){
        driver.quit();
    }*/
}
