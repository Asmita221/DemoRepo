package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Handling Dropdown and check whether it is sorted or not....
public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NTS-Asmita Raut\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement element = driver.findElement(By.id("country"));
        Select se = new Select(element);
        se.selectByVisibleText("India");
        List country_list = new ArrayList();
        List sort_country = new ArrayList<>();
        List<WebElement> list = se.getOptions();
        for(WebElement items:list){
           country_list.add(items.getText());
           sort_country.add(items.getText());
        }
        //System.out.println(country_list);
        System.out.println("dropdown is sorted or not");
        System.out.println("*******************************************");
        Collections.sort(sort_country);
        System.out.println("original country list: "+country_list);
        System.out.println("sorted country list: "+sort_country);

        if(sort_country==country_list){
            System.out.println("Dropdown is sorted");
        }
        else {
            System.out.println("dropdown is not sorted");
        }
    }
}
