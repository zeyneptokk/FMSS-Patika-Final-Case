Feature: Login functionality verification

  @login1
  Scenario: Verify correct email and password login
    Given User opens app and click Giris Yap
    And User fills email "johndoe@example.com"
    And User fills password "********"
    And User clicks Giris Yap button
    Then User redirected to Anasayfa page

  @login2
  Scenario: Invalid email verification
    Given User opens app and comes Giris Yap
    And User fills email with "invalid email"
    And User fills password field "********"
    And User taps Giris Yap button
    Then User should see message "Yanlis email"


  @login3
  Scenario: Invalid password verification
    Given User opens app and goes to Giris Yap
    And User writes email "johndoe@example.com"
    And User writes password "wrongpassword"
    And User clicks Giris Yap
    Then User see message "Sifreniz yanlis"

  @login4
  Scenario: Empty fields verification
    Given User opens app and goes into Giris Yap
    And User leaves empty email area
    And User leaves empty password area
    And User clicks to Giris Yap button
    Then User sees message "Alanlar bos birakilamaz"


  @login5
  Scenario: Not existing user login verification
    Given User opens app and comes into Giris Yap screen
    And User tries to write "email@example.com"
    And User writes "password"
    And User tap on Giris Yap button
    Then User sees this message "Bu emaile kayitli kisi bulunamadi"