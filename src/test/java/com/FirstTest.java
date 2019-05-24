package com;
 
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

public class FirstTest extends TestBase {
    WebDriver driver;
    WebDriverWait wait;
    
  

 
    @Test
    public void GOOGLE0() throws Exception {
    	WebDriver driver = TLDriverFactory.getDriver();
    	WebDriverWait wait = TLDriverFactory.getWait(driver);
        System.out.println("Google0 Test Started! " + Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google0 Test's Page title is: " + driver.getTitle() + " " + Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google0 Test Ended! " + Thread.currentThread().getId());
    }
 
    @Test
    public void GOOGLE2() throws Exception {
    	WebDriver driver = TLDriverFactory.getDriver();
    	WebDriverWait wait = TLDriverFactory.getWait(driver);
        System.out.println("Google2 Test Started! " + Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google2 Test's Page title is: " + driver.getTitle() + " " + Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google2 Test Ended! " + Thread.currentThread().getId());
    }
 
    @Test
    public void GOOGLE3() throws Exception {
    	WebDriver driver = TLDriverFactory.getDriver();
    	WebDriverWait wait = TLDriverFactory.getWait(driver);
        System.out.println("Google3 Test Started! " + Thread.currentThread().getId());
        driver.navigate().to("http://www.google.com");
        System.out.println("Google3 Test's Page title is: " + driver.getTitle() + " " + Thread.currentThread().getId());
        Assert.assertEquals(driver.getTitle(), "Google");
        System.out.println("Google3 Test Ended! " + Thread.currentThread().getId());
    }
 
    @Test
    public void testLoginok() throws Exception {
    	WebDriver driver = TLDriverFactory.getDriver();
    	WebDriverWait wait = TLDriverFactory.getWait(driver);
      driver.get("http://loginapphmis2019jjcanada.azurewebsites.net/");
      driver.findElement(By.linkText("Log in")).click();
      driver.findElement(By.id("Input_Email")).click();
      driver.findElement(By.id("Input_Email")).clear();
      driver.findElement(By.id("Input_Email")).sendKeys("hola2019@ual.es");
      driver.findElement(By.id("Input_Password")).clear();
      driver.findElement(By.id("Input_Password")).sendKeys("ABab12!!");
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]")).click();
      Assert.assertEquals("Hello hola2019@ual.es!", driver.findElement(By.linkText("Hello hola2019@ual.es!")).getText());
      driver.findElement(By.xpath("//form[@id='logoutForm']/ul/li[2]/button")).click();
      Assert.assertTrue(isElementPresent(driver, By.linkText("Log in")));
      Assert.assertEquals("Log in", driver.findElement(By.linkText("Log in")).getText());
    }
    

    private boolean isElementPresent(WebDriver driver, By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

}