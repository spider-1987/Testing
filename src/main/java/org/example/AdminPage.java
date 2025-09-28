package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminPage {

    static WebDriver driver;

    private static String adminName = "//li[1]//a[1]//span[1]";
    private static String userName = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input";
    private static String searchButton = "//button[normalize-space()='Search']";
    void clickAdmin() throws InterruptedException
    {
      driver.findElement(By.xpath(adminName)).click();
      Thread.sleep(1500);
    }

    void enterUserName() throws InterruptedException
    {
        driver.findElement(By.xpath(userName)).sendKeys("Tina4527");
        Thread.sleep(1000);
        driver.findElement(By.xpath(searchButton)).click();
    }

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        AdminPage adminpage = new AdminPage();
        WebsiteTest websiteTest = new WebsiteTest();

        websiteTest.openwebsite();
        websiteTest.username();
        websiteTest.password();
        websiteTest.login();

        adminpage.clickAdmin();
        adminpage.enterUserName();

    }
}
