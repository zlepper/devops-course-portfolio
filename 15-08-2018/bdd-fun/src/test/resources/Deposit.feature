@tag
Feature: Cash deposit at an ATM. Customer can make a cash deposit using an ATM.

  @tag1
  Scenario: Successful cash deposit
    Given I have an account with a balance of 100
    When I make a deposit of 50 at an ATM
    Then the ATM displays a message that deposit was successful
    And my account has a new balance of 150

  Scenario: Successful cash withdrawal
    Given I have an account with a balance of 100
    When I make a withdrawal of 50 at an ATM
    Then the ATM displays a message that withdrawal was successful
    And my account has a new balance of 50
