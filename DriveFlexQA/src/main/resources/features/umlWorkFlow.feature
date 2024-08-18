Feature: Work flow verifications

  Background: User is logged into app
    Given User is logged into app

  @scenario1
  Scenario: User selects car verification
    When User clicks the car from Anasayfa screen
    Then User is redirected to Kiralama screen

  @scenario2
  Scenario: User selects car that is available at that date
    When User clicks the car from screen
    And User redirected to Kiralama screen
    And User selects date that she wants to rent
    Then User is redirected to Kiralama Sozlesme screen

  @scenario3
  Scenario: User selects car that is not available at that date
    When User selects car from screen
    And User is in the Kiralama screen
    And User selects date
    Then User sees message "Başka tarih veya araç seçin"

  @scenario4
  Scenario: User approves Kiralama Sozlesmesi
    When User clicks car from screen
    And User is on Kiralama screen
    And User selects available dates
    And User is on Kiralama Sozlesme screen
    Then User approves Kiralama Sozlesmesi

  @scenario5
  Scenario: User does not approve Kiralama Sozlesmesi
    When User selects car from Anasayfa screen
    And User is on the Kiralama screen
    And User selects valid dates
    And User comes into Kiralama Sozlesme screen
    And User does not approve Kiralama Sozlesmesi
    Then User sees message "Sozlesmeyi onaylayin"

  @scenario6
  Scenario: User driver license verification
    When User selects car from the screen
    And User is on Kiralama screen
    And User selects valid dates from screen
    And User approves the Sozlesme
    And User has driver license
    Then User is redirected to Odeme screen

  @scenario7
  Scenario: User driver license not exist
    When User choose car from screen
    And User comes into Kiralama page
    And User choose available dates
    And User checks the Sozlesme
    And User driver license not exist
    Then User is redirected to driver license info page

  @scenario8
  Scenario: User successful rent verification
    When User choose car from Anasayfa
    And User is on Kiralama page
    And User choose valid dates
    And User checks Sozlesme
    And User driver license info valid
    And User is redirected to Odeme page
    And User fills valid card info
    Then User should see message "Odeme Basarili"

  @scenario9
  Scenario: User invalid card info
    When User choose car from Anasayfa page
    And User is in the Kiralama page
    And User choose dates that is available
    And User has driver license info
    And User is on Odeme page
    And User fills invalid car info
    Then User sees message "Kart bilgileri yanlis"

  @scenario10
  Scenario: User card insufficient funds verification
    When User selects car from Anasayfa page
    And User comes in Kiralama page
    And User choose dates from page
    And User has driver license information
    And User comes into Odeme page
    And User fills card with insufficient funds
    Then User sees message "Odeme basarisiz"

  @scenario11
  Scenario: User receives rent receipt
    When User selects car from page
    And User is on the Kiralama page
    And User selects date that available
    And User is on Odeme screen page
    And User fills card with sufficient funds
    And User sees message "Odeme Basarili"
    Then User recieves rent receipt via email

  @scenario12
  Scenario: User selects car from search bar
    When User types "arac" to search
    And User selects car from list
    Then User is navigated to Kiralama screen

  @scenario13
  Scenario: Search bar not found car
    When User types "invalid car name" to search
    Then User should see message "Arac bulunamadi"

  @scenario14
  Scenario: User filters cars by gear type verification
    When User filters cars by gear type
    And User should see list of cars by gear type
    And User clicks one of the cars
    Then User goes to Kiralama page


  @Scenario15
  Scenario: User filters cars by year
    When User filters cars by year
    And User see list of cars by year
    And User clicks car from list
    Then User goes to Kiralama screen

  @scenario16
  Scenario: User filters cars by engine type
    When User filters cars by engine type
    And User see list of cars by engine type
    And User clicks car from list by engine
    Then User goes into Kiralama page

  @scenario17
  Scenario: User filters cars by model
    When User filters cars from model
    And User see list of cars by model
    And User clicks car from list by model
    Then User goes into Kiralama screen

  @scenario18
  Scenario: User filters cars with invalid filters
    When User filters cars with invalid filters
    Then User sees message "Aradiginiz kriterlere uygun arac bulunamadi"

  @scenario19
  Scenario: User sees map and near cars
    When User is on Anasayfa page
    Then User sees her location and near cars to her

  @scenario20
  Scenario: User location not found
    When User does not give location permission
    Then User sees only map view