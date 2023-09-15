package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NTS-Asmita Raut\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/java/java_regex.asp");
        int row_count = driver.findElements(By.xpath("//table[1]//tbody//tr")).size();
        System.out.println("Number of rows present in given table: "+ row_count);
        int column_count = driver.findElements(By.xpath("//table[1]//tbody//tr//th")).size();
        System.out.println("Number of columns present in given table: "+ column_count);
        for(int i =2;i<=row_count;i++){
            for(int j =1;j<=column_count;j++){
                String data =driver.findElement(By.xpath("//table[1]//tbody//tr["+i+"]//td["+j+"]")).getText();
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }
}
