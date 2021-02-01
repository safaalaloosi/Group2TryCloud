package com.trycloud.tests.UC1_Safa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
        Thread.sleep(3000);
        driver.findElement(By.name("user")).sendKeys("User2");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-form")).click();
        String expectedURL = "http://qa.trycloud.net/index.php/apps/files/";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedURL)){
            System.out.println("URL VERIFICATION PASSED!");
        }else {
            System.out.println("URL VERIFICATION FAILED!!!");
        }
        System.out.println("actualUrl = "+ actualUrl);
        System.out.println("expectedURL ="+ expectedURL);
        Thread.sleep(300);
        driver.close();

    }
}
