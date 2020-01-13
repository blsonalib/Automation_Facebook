package com.bridgelabz.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class MainTest extends BaseTest{

 String url = "https://www.facebook.com/?stype=lo&jlou=Afd8ScPF89U7X_wmptyGFuZxft68Fj7e75oiRIoGLV6IuFAnkaXGpU1CYGsUSofSnRX0ubMuVrd8qNlv3yPAXCSXuEFHtke2opGDY3GxB2vvqA&smuh=30297&lh=Ac-pKEROIXUGklNU";
    @Test
    public void Login() throws InterruptedException {
        driver.get(url);
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("priyankagund18@gmail.com");
        WebElement Password = driver.findElement(By.id("pass"));
        Password.sendKeys("861997");
        WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]"));
        Login.click();
        WebElement bar = driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
        bar.click();
        Thread.sleep(5000);
        WebElement logOut = driver.findElement(By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']"));
        logOut.click();
    }

    @Test
    public void SignUpForm() throws InterruptedException {
        driver.navigate().to(url);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("sonali");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("lonare");
        WebElement mobileNo = driver.findElement(By.name("reg_email__"));
        mobileNo.sendKeys("5634365476");
        WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
        newPassword.sendKeys("sona123456");

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
        //use xpath
        WebElement female = driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value=1]"));
        female.click();
        Thread.sleep(1000);

        WebElement signUp = driver.findElement(By.xpath("//button[@type='submit' and  @class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
        signUp.click();
    }
    @Test
    public void actions(){
        
    }
}
