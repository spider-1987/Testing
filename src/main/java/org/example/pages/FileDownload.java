package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.HomePage.driver;

public class FileDownload {

    public static WebDriver Driver;

    void web()
    {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    void clickDownload() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='File Download']")).click();

    }

    void clickFile() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='avatar.jpg']")).click();
    }


    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        FileDownload fileDownload = new FileDownload();
        fileDownload.web();
        fileDownload.clickDownload();
        fileDownload.clickFile();
    }

}
