package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NTS-Asmita Raut\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://my-learning.w3schools.com/");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.selenium.dev/downloads/");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        driver.close();
    }
}
