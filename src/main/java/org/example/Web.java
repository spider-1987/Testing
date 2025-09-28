package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

   public static WebDriver driver;
    void openWebsite()
    {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }
    void ABTesting() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='A/B Testing']")).click();
        Thread.sleep(2000);
    }
    void inputs() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Inputs']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567898");
        Thread.sleep(1000);
    }
    void closewindow()
    {
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {

         driver  = new ChromeDriver();
         Web homepage = new Web();
         homepage.openWebsite();
         homepage.inputs();
         homepage.closewindow();





    }
}
