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

public class TflTest {
    private static WebDriver webDriver;
    private static WebDriverWait wait;

    @BeforeAll
    static void setup()
    {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://localhost:8000");
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    @Test
    void testLogin()
    {
        WebElement gallery = webDriver.findElement(By.id("galleryLink"));
        WebElement about = webDriver.findElement(By.id("aboutLink"));
        WebElement contact = webDriver.findElement(By.id("contactLink"));
        WebElement login = webDriver.findElement(By.id("loginLink"));

        try{
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        gallery.click();

        String afterclickgallery = webDriver.getCurrentUrl();
        System.out.println("Redirected to: " + afterclickgallery);

        assertTrue(afterclickgallery.contains("catalog.html"),"Expected redirect to catalog.html but got: " + afterclickgallery);

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }

        WebElement jasmine = webDriver.findElement(By.id("1"));
        jasmine.click();

        String afterclickme = webDriver.getCurrentUrl();
        System.out.println("Redirected to: " + afterclickme);

        assertTrue(afterclickme.contains("details.html"),"Expected redirect to catalog.html but got: " + afterclickme);

        try{
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        WebElement cart = webDriver.findElement(By.id("btnAddToCart"));
        cart.click();

        String afterclickcart = webDriver.getCurrentUrl();
        System.out.println("Redirected to: " + afterclickcart);

        assertTrue(afterclickcart.contains("cart.html"),"Expected redirect to catalog.html but got: " + afterclickcart);

         try{
            Thread.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        WebElement productidentifier=webDriver.findElement(By.id("txtid"));
    productidentifier.sendKeys("9");
    try{
        Thread.sleep(2000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    WebElement productquantity=webDriver.findElement(By.id("txtquantity"));
    productquantity.sendKeys("10");
     try{
        Thread.sleep(2000); 
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    
        WebElement addtocartbtn=webDriver.findElement(By.id("add-to-cart"));
        addtocartbtn.click();
        try{
        Thread.sleep(2000); 
        }
        catch(InterruptedException e){
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
