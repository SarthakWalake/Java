package com.tap.sarthak.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {
    private static WebDriver webDriver;
    private static WebDriverWait wait;

    @BeforeAll
    static void setup()
    {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://127.0.0.1:5500/src/Html/Registration.html");
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    @Test
    void testLogin()
    {
        WebElement username = webDriver.findElement(By.id("username"));
        WebElement email = webDriver.findElement(By.id("email"));
        WebElement password = webDriver.findElement(By.id("password"));
        WebElement male = webDriver.findElement(By.id("male"));
        WebElement female = webDriver.findElement(By.id("female"));
        WebElement checkbox = webDriver.findElement(By.id("remember"));
        WebElement notification = webDriver.findElement(By.id("toggle"));
        WebElement role = webDriver.findElement(By.id("role"));
        WebElement comments = webDriver.findElement(By.id("comments"));
        WebElement date = webDriver.findElement(By.id("dob"));
        WebElement submit = webDriver.findElement(By.id("submit"));
        
        try{
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        username.sendKeys("sarthakwalake");
        try{
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        email.sendKeys("sarthakwalake@gmail.com");
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }

        password.sendKeys("Sarthak");
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }

        if(!male.isSelected()){
            male.click();
        }
          
        if(!checkbox.isSelected()){
            checkbox.click();
        }

        if(!notification.isSelected()){
            notification.click();
        }

        Select selectRole = new Select(role);
        selectRole.selectByValue("student");

        comments.sendKeys("This is the student registration form");
        try{
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);

        }

        date.sendKeys("03/02/2004");
        try{
            Thread.sleep(2000);
        }catch(Exception e)
        {
             System.out.println(e);
        }

       
        String enteredUsername = username.getAttribute("value");

        submit.click();

        wait.until(ExpectedConditions.urlContains("Welcome.html"));
        WebElement welcome = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        assertTrue(welcome.getText().contains("Login successful! Welcome, " + enteredUsername));

        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
      }
      
      @AfterAll
      static void exit()
      {
        if(webDriver != null)
        {
            webDriver.quit();
        }
    }
}
