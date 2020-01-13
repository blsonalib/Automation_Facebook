package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsOperation extends Actions_Main{
    String url = "https://www.google.com/";

    @Test

    void mouseActions() throws InterruptedException {
        driver.get(url);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Gmail"))).click().perform();
        Thread.sleep(6000);
    }
 @Test
    void mouseDoubleClick() throws InterruptedException {
        driver.navigate().to(url);
      Actions actions = new Actions(driver);
      actions.doubleClick(driver.findElement(By.linkText("Gmail"))).perform();
      Thread.sleep(3000);
    }
    @Test
    void dragonDropOperation() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement From=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
        WebElement To=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(From, To).build().perform();
        Thread.sleep(7000);
    }
}
