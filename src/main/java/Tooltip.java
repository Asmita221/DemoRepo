import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://matrixcalc.org/#%7B%7B3,4,5%7D%7D*%7B%7B13,9,7,15%7D,%7B8,7,4,6%7D,%7B6,4,0,3%7D%7D");
        WebElement EXP = driver.findElement(By.id("expression"));
        System.out.println(EXP.getAttribute("title"));
        WebElement home = driver.findElement(By.id("add-to-homescreen-button"));
        System.out.println(home.getAttribute("title"));
    }
}
