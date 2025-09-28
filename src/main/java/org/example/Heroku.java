package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.HomePage.driver;

public class Heroku {

    public static WebDriver driver;

    void web()
    {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    void FormAuthentication() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']")).click();

    }

    void Login() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        Thread.sleep(1000);
        //driver.switchTo().alert().accept();
    }

    void Logout() throws InterruptedException {
        Thread.sleep(2000);
       // driver.findElement(By.xpath("")) ;
       // driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();
    }


    public static void main(String[] args) throws InterruptedException {


        driver = new ChromeDriver();

        Heroku heroku = new Heroku();
        heroku.web();
        heroku.FormAuthentication();
        heroku.Login();
        heroku.Logout();



    }


}
