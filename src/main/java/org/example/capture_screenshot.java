package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class capture_screenshot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");

        System.out.println("Capturing screenshot of full page.....");
        TakesScreenshot ss = (TakesScreenshot)driver;
        File src = ss.getScreenshotAs(OutputType.FILE);
        File des = new File(".\\Screenshot\\home.png");
        FileHandler.copy(src,des);

        System.out.println("Capturing screenshot of arrivals section.....");
        WebElement arrival = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div"));
        File cap = arrival.getScreenshotAs(OutputType.FILE);
        File store = new File(".\\Screenshot\\arrivals.png");
        FileUtils.copyFile(cap,store);

        System.out.println("Capturing screenshot of symbol.......");
        WebElement symbol = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/a/img"));
        File cap1 = symbol.getScreenshotAs(OutputType.FILE);
        File store2 = new File(".\\Screenshot\\symbol.png");
        FileUtils.copyFile(cap1,store2);


    }
}
