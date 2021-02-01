package com.trycloud.tests.Sumeyye;

import com.trycloud.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UploadFile {
    public WebDriver driver;
    @BeforeClass

    public void setupClass(){


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
    public void uploadedFile(){
        WebElement plusIcon= driver.findElement(By.xpath("//span[@class='icon icon-add']"));
        plusIcon.click();

        WebElement uploadButton= driver.findElement(By.xpath("//span[.='Upload file']"));
        uploadButton.click();
      //  WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
      //  uploadElement.sendKeys("C:\\newhtml.html");

    }
}
