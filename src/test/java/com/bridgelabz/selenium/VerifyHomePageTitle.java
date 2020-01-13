package com.bridgelabz.selenium;

import org.testng.annotations.Test;

public class VerifyHomePageTitle extends Actions_Main {
    @Test
    void forTitle(){
        driver.get("https://www.google.com/");
        String exceptedTitle = "Enter Title";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(exceptedTitle)){
            System.out.println("Home page displyed");
        }else{
            System.out.println("Home page not displayed");
        }
    }
}
