Feature: Logout verification scenarios

  Scenario: Successful logout verification
    Given User logged into app
    And User is on profile page
    And User clicks to Cikis Yap button
    And User sees alert "Cikis yapmak istediginize emin misiniz?"
    And User clicks Evet
    Then User is redirected to launch screen

  Scenario: Unsuccessful logout verification
    Given User logged in the app
    And User is in the profile screen
    And User taps cikis Yap button
    And User sees alert message "Cikis yapmak istediginize emin misiniz?"
    And User clicks Hayır
    Then User is redirected to anasayfa