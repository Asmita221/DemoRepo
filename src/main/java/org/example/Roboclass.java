package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Roboclass {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        //Actions ac = new Actions(driver);
        Thread.sleep(4000);
        Robot robot = new Robot();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyPress(KeyEvent.VK_ENTER);



    }
}
