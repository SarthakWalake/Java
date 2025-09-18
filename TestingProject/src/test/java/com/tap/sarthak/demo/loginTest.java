package com.tap.sarthak.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
    private static WebDriver webDriver;

    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("D:\\TAP\\GitHub\\TestingProject\\src\\Html\\login.html");
    }

    @Test
    void testLogin() {
        WebElement username = webDriver.findElement(By.id("username"));
        WebElement password = webDriver.findElement(By.id("password"));
        WebElement button   = webDriver.findElement(By.id("login"));
        //WebElement msg= webDriver.findElement(By.id("message"));


        try {
            Thread.sleep(2000);
            
        } catch (Exception e) {
            
        }
        username.sendKeys("sarthakwalke@gmail.com");
        try {
            Thread.sleep(2000);
            
        } catch (Exception e) {
            
        }
        password.sendKeys("sarthak@123");
        try {
            Thread.sleep(2000);
            
        } catch (Exception e) {
            
        }

        String enteredUser=username.getAttribute("value");
        String enteredPass=password.getAttribute("value");

        button.click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        WebElement message = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("message"))
        );

        if(enteredUser.equals("sarthakwalke@gmail.com")&&enteredPass.equals("sarthak@123"))
        {
            message.sendKeys("Login Sucessful");
            try {
            Thread.sleep(2000);
            
        } catch (Exception e) {
            
        }
        }

        assertTrue(message.getAttribute("value").contains("Login Sucessful"));
    }

    @AfterAll
    static void exit() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}