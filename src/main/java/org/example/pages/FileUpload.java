package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.HomePage.driver;

public class FileUpload {

    public static WebDriver driver;

    void web()
    {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
    }
    void ClickUpload()
    {
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='file-upload']"));
        String filePath = System.getProperty("D:\\avatar (1)") + "/test-data/sample-upload.txt";
//        uploadElement.click(filePath);
        uploadElement.sendKeys(filePath);

    }

    public static void main(String[] args) {

        driver = new ChromeDriver();

        FileUpload fileUpload = new FileUpload();
        fileUpload.web();
        fileUpload.ClickUpload();

    }
}
