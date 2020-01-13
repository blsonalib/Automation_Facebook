package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ForTwoBrowser {

  static  WebDriver driver;

    @Test
    public static void chome(){
        System.setProperty("webdriver.chrome.driver","/home/admin1/IdeaProjects/Selenium_Testing/Driver/chromedriver_linux64 (1)/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://github.com/login");
    }
    @Test
   public static void gecko(){
        System.setProperty("webdriver.gecko.driver","/home/admin1/IdeaProjects/Selenium_Testing/Driver/geckodriver");
        driver= new FirefoxDriver();
        driver.get("https://github.com/login");
    }
}
