package com.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Test;

public class SauceDemoLoginTest {

    @Test
    public void verifyUserCanLoginSuccessfully() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click login
        driver.findElement(By.id("login-button")).click();

        // Assertion: verify inventory page is displayed
        String pageTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals("Products", pageTitle);

        driver.quit();
    }
}
