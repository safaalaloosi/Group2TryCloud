package com.trycloud.tests.Sumeyye;

import com.trycloud.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileModule {
   public  WebDriver driver;
    @BeforeClass

    public void setupClass(){
        //TC#1: Verifying "Simple dropdown" and "State selection" dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown

        driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
        WebElement inputUsername=driver.findElement(By.xpath("//input[@id='user']"));
        inputUsername.sendKeys("User2");

        WebElement inputPassword=driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys("Userpass123");


        WebElement loginButton=driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

    }

    @Test

    public void FileModule1(){




        WebElement fileModule=driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        fileModule.click();

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();


    }


}
