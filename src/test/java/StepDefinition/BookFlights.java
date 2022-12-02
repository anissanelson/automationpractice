package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BookFlights {

    @Given("I am on the homepage{string}")
    public void iAmOnTheHomepageWelcomeToTheSimpleTravelAgency() {
        System.out.println("I am on Blazedemo Homepage");
    }

    @When("{string} is selected as the departure city")
    public void isSelectedAsTheDepartureCity(String departureCity) {
        System.out.println("Your selected departure city is" + departureCity);
    }

    @And("{string} is selected as the destination city")
    public void isSelectedAsTheDestinationCity(String destinationCity) {
        System.out.println("Your selected destination city is" + destinationCity);
    }

    @Then("Available flights from San Diego to New York are displayed")
    public void availableFlightsFromSanDiegoToNewYorkAreDisplayed() {
        //assertaions are needed
        System.out.println("Display available flights");
    }
}

