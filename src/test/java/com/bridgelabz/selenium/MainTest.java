package com.bridgelabz.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MainTest extends BaseTest{

 String url = "https://www.facebook.com/index.php?next=https%3A%2F%2Fwww.facebook.com%2Fgettingstarted%2F%3Fstep%3Dfriend_requests";
    @Test
    public void Login(){
        driver.get(url);
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("sonalilonare05@gmail.com");
        WebElement Password = driver.findElement(By.id("pass"));
        Password.sendKeys("sonalilonare19");
        WebElement Login = driver.findElement(By.id("loginbutton"));
        Login.click();
    }

    @Test
    public void SignUpForm(){
        driver.navigate().back();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("sonali");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Bankar");
        WebElement mobileNo = driver.findElement(By.name("reg_email__"));
        mobileNo.sendKeys("5634365476");
        WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
        newPassword.sendKeys("sona123456");
    }
    @Test
    public void dropDown() throws InterruptedException {
        Select date = new Select(driver.findElement(By.name("birthday_day")));
        //find the selected index value
        date.selectByIndex(19);
        Select month = new Select(driver.findElement(By.name("birthday_month")));
        //for selected text visible
        month.selectByVisibleText("May");
        Select year = new Select(driver.findElement(By.name("birthday_year")));
        //for select value
        year.selectByValue("1994");
        //for waiting 1second
        Thread.sleep(1000);
    }
    @Test
    public void radioButton() throws InterruptedException {
        //use xpath
        WebElement female = driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value=1]"));
        female.click();
        Thread.sleep(1000);
    }

    @Test
    public void signUp(){
        WebElement signUp = driver.findElement(By.xpath("//button[@type='submit' and  @class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
        signUp.click();
    }
}
