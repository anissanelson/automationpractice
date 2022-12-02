package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables


        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://blazedemo.com/";
        String expectedTitle = "Welcome to the Simple Travel Agency!";
        String actualTitle = "";

        // launch chrome  and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close
        driver.close();

    }

}