package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NTS-Asmita Raut\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/input")).click();
        for(int i =7;i>=1;i--){
            driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/div/div/div[1]/a[2]/span")).click();
            String month = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/div/div/div[1]/div/span[1]")).getText();
            if(month.equals("October")){
                driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[2]/div[1]/p-calendar/span/div/div/div[2]/table/tbody/tr[1]/td[5]/a")).click();
                break;
            }
        }
        //driver.close();
    }
}
