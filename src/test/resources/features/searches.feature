#selectflights



      @SanDiegoToNewYork

      Feature: users searches flights departing from San Diego to New York

        Scenario: Flying from San Diego to New York
          Given I am on the homepage'Welcome to the Simple Travel Agency!'
          When "San Diego" is selected as the departure city
          And  "New York" is selected as the destination city
          Then Avaible flights from San Diego to New York are displayed