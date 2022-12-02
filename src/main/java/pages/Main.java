package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;


public class Main {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.blazedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Blazed website");

        WebElement flights = driver.findElement(By.xpath("[type=submit]"));//(".container > input"));
        flights.click();
        System.out.println("Found Blazed");
        driver.close();


    }

    public void startDriver() {
        driver = WebDriverManager.chromedriver().create();

    }

    public void close() {

    }


}


