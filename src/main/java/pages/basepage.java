package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

abstract public class basepage {

    WebDriver driver;
    WebDriverWait wait;

    public basepage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(25));

    }


    public void waitAndClick(By Selector) {

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Selector));
        element.click();


    }


    public String getElementText(By selector) {
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        //Assert.assertEquals(selector, header.getText());
        return header.getText();
    }


}
