#payment

  Feature: Payment for flight
    Scenario: User inputting details in order to pay for flight
      Given The user is on payment page
      When User enters details as follows
      |name|address|City|Sate|Zip code

      And Credit card information
      |CC Nums|Month|2017|Name on Card
      Then flight will be purchased

