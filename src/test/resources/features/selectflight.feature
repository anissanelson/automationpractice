#boookingflights

  @SanDiegotoNewYork
Feature: user ability to book a flight


  Scenario: user would like to book a flight from San Diego to New York

    Given User has searched flights from San Diego to New York
    When User clicks 'choose flight' on flight no.12
    Then User is taking to payment page




