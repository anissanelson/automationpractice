package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class flightsnotfeelings extends basepage {

    static By fromPort = By.xpath("//select[@name='fromPort']");
    static By toPort = By.xpath("//select[@name='toPort']");
    static By findFlight = By.xpath("//input[@class='btn btn-primary']");
    static By Header_Text = By.tagName("h3");

    public flightsnotfeelings(WebDriver driver) {
        super(driver);
    }

    public void selectDeparture(String departureCity) {
        Select drpCity = new Select(driver.findElement(fromPort));
        drpCity.selectByVisibleText(departureCity);
    }

    public void selectDestination(String destinationCity) {
        Select drpCity2 = new Select(driver.findElement((toPort)));
        drpCity2.selectByVisibleText(destinationCity);
    }

    public void waitAndClick(By Selector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Selector));
        element.click();


    }

    public void clickFindFlightButton() {
        waitAndClick(findFlight);
    }

    public String getElementText(By selector) {

        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        //Assert.assertEquals(selector, header.getText());
        return header.getText();
    }

    public String getFlightResults() {
        return getElementText(By.tagName("h3"));
    }


}
