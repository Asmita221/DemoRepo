package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NTS-Asmita Raut\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");
        String first =driver.getWindowHandle();
        //String first = driver.getTitle();
        driver.findElement(By.xpath("//a//button")).click();
        Set<String> all_windows = driver.getWindowHandles();
        for (String a:
             all_windows) {
            driver.switchTo().window(a);
            System.out.println(driver.getTitle());
        }
        driver.switchTo().window(first);
        if(all_windows.contains(first)){
            driver.close();
        }
        else {
            driver.quit();
        }
    }
}
