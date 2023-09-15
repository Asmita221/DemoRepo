package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NTS-Asmita Raut\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://profile.w3schools.com/"); //open url
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asmitaraut2212@gmail.com");
        driver.findElement(By.name("current-password")).sendKeys("Raut@2212");
        driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
        String expected = "Log in - W3Schools";
        String actual = driver.getTitle();
//        Thread.sleep(2000);
//        WebElement element = driver.findElement(By.xpath("//h2[1]"));
//        Thread.sleep(2000);
//        String text = element.getText();
//        System.out.println(text);
        if(expected.equals(actual)){
            System.out.println("Test case is passed");
        }
        else {
            System.out.println("Test case is failed");
        }
        driver.quit();
    }
}
