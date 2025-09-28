package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTest {

    public static WebDriver driver;

    void openwebsite()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    void username() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(2000);
    }
    void password() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(2000);

    }
    void login() throws InterruptedException {
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
      //  Thread.sleep(5000);
    }
    void Admin() throws InterruptedException {
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("12345");
    }
    void job() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Job']//i[@class='oxd-icon bi-chevron-down']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Job Titles']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='rowgroup']//div[2]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Tester");
    }
    void pim() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Leave']")).click();
        //driver.findElement(By.xpath("//a[normalize-space()='']")).click();
    }

    void time() throws InterruptedException {
        {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[normalize-space()='Time']")).click();
        }
    }

    void website1() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
    }
    void logout() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
    }



    public static void main(String[]args) throws InterruptedException {
        driver = new ChromeDriver();
        WebsiteTest hrm = new WebsiteTest();
        hrm.openwebsite();
       hrm.username();
        hrm.password();
        hrm.login();
        hrm.Admin();
        hrm.job();
       hrm.pim();
        hrm.time();
      hrm.website1();
       hrm.logout();
    }
}
