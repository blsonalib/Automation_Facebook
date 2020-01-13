package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyUNandPWDalignment {
    @Test
    public void forSize() {
        System.setProperty("webdriver.chrome.driver", "/home/admin1/IdeaProjects/Selenium_Testing/Driver/chromedriver_linux64 (1)/chromedriver");
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        int UN_X = unTB.getLocation().getX();
        System.out.println("Size of UN in x axis  :"+UN_X);
        int UN_Width = unTB.getSize().getWidth();
        System.out.println("width of UN"+UN_Width);
        int UN_height = unTB.getSize().getHeight();
        System.out.println("height of UN"+UN_height);
        WebElement PassTB = driver.findElement(By.id("pass"));
        int Pass_X = unTB.getLocation().getX();
        System.out.println("Size of Pass in x axis  :"+Pass_X);
        int Pass_Width = PassTB.getSize().getWidth();
        System.out.println("width of pass"+Pass_Width);
        int Pass_height = PassTB.getSize().getHeight();
        System.out.println("height of pass"+Pass_height);
        if(UN_X == Pass_X && UN_Width==Pass_Width && UN_height==Pass_height){
            System.out.println("Username and password text box are aligned");

        }else{
            System.out.println("Username and password text box are NOT aligned");
        }
        driver.quit();

    }
}
