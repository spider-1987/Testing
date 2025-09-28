package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.HomePage.driver;

public class JS_Alert {

    public static WebDriver Driver;

    void openWeb()
    {
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

    }

  //  void swipeDown()
 //   {
 //       JavascriptExecutor js = (JavascriptExecutor) driver;
 //       js.executeScript("window.scrollBy(0,350)","");
 //   }

    void clickJsAlerts() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='JavaScript Alerts']")).click();

        for(int i=0;i<3;i++) {
            Thread.sleep(2000);
          //  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
           // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
            driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
            Thread.sleep(2000);
          //  driver.switchTo().alert().accept();
          //  driver.switchTo().alert().dismiss();
            driver.switchTo().alert().sendKeys("Anant");
            driver.switchTo().alert().accept();
        }
    }

   // void click()
   // {
      //  driver.findElement(By.xpath("(//button[normalize-space()='Click for JS Alert'])[1]")).click();
   // }

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        JS_Alert jsAlert = new JS_Alert();
        jsAlert.openWeb();
      //  jsAlert.swipeDown();
        jsAlert.clickJsAlerts();
       // jsAlert.click();

    }
}
