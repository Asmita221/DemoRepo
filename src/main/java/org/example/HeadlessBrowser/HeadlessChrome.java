package org.example.HeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
    public static void main(String[] args) {
        //driver setting
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NTS-Asmita Raut\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //making chromedriver headless
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);  // by using setHeadless
        options.addArguments("--headless"); // by using addArguments
        //Initiating chromedriver
        WebDriver driver = new ChromeDriver(options);
        //Max driver window
        driver.manage().window().maximize();
        driver.get("https://profile.w3schools.com/");
        System.out.println("Page Title: "+driver.getTitle());


    }
}
