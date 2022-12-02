package StepDefinition;

import env.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.flightsnotfeelings;
import pages.homepage;

public class BaseSteps {

    private static final WebDriver driver = DriverUtil.getDefaultDriver();

    public void BaseSteps() {
        PageFactory.initElements(driver, homepage.class);
        PageFactory.initElements(driver, flightsnotfeelings.class);
    }
}
