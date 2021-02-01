package com.trycloud.tests.UC1_Safa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CannotLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
        Thread.sleep(3000);
        driver.findElement(By.name("user")).sendKeys("User2");
        driver.findElement(By.id("password")).sendKeys("User345");
        driver.findElement(By.id("submit-form")).click();
        String expectedMassage = "Wrong username or password.";
        String actualMassage = "Wrong username or password.";
        WebElement wrongUserNameOrPassword = driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']"));
        Assert.assertTrue(wrongUserNameOrPassword.isDisplayed());
        if (actualMassage.equals(expectedMassage)) {
            System.out.println("Massage Verification PASSED!");
        } else System.out.println("Massage verification FAILED!!!");
        System.out.println("ecpectedMassage = " + expectedMassage);
        System.out.println("actualMassage =" + actualMassage);


        }  
    }





