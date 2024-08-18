Feature: Database foreign keys and columns verification

  Scenario:
    Given User has address table fk
    When User add one address
    Then Address table has user_id is filled

  Scenario:
    Given User has phone verification table
    When User add one phone number
    Then Phone verification table has user_id is filled

  Scenario:
    Given User has email verification table
    When User add one email
    Then Email verification table has user_id is filled

  Scenario:
    Given User has drivers license information table
    When User add one driver license
    Then Drivers license table has user_id is filled

  Scenario: first_name data not null verification
    Given User has user profile table
    When User try to registrate without first_name
    Then User receieves a message "first_name column can not be null"

  Scenario: first_name data VARCHAR(100) verification
    Given User has user profile table
    And User writes first_name longer than 100 characters
    Then User receieves an error that it can not be longer than 255 characters

  Scenario: first_name data type string verification
    Given User has user profile table
    And User writes first_name an integer number 23
    Then User see message "first_name should be VARCHAR(100)"

  Scenario: birth_date data tpe verification
    Given User has user profile table
    And User writes birth_date as string "1.1.2001"
    Then User sees message "data should be in the right date format"



