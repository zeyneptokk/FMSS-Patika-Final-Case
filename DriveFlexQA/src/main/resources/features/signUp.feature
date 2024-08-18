Feature: Sign Up verification scenarios

  Scenario: User sign up verification
    Given User opens app and clicks Kayit Ol
    And User fills all areas with valid info
    And User checks KVKK box
    And User clicks Kayit Ol
    Then User is navigated to OTP screen

  Scenario: User leave empty phone number
    Given User opens app and comes Kayit Ol
    And User leaves phone number area empty
    And User clicks Kayit Ol button
    Then User see error "Telefon bilgisi girmelisiniz"

  Scenario: User uncheck KVKK box
    Given User is in app and Kayit Ol
    And User fills areas with valid info
    And User clicks Kayit button
    Then User see msg "KVKK onaylayin"

  Scenario: User wrong email format
    Given User is on the app and in Kayit Ol
    And User writes email area "email@com"
    And User taps Kayit Ol
    Then User see "Yanlis email formati"

  Scenario: User weak password
    Given User launches app and in Kayit Ol screen
    And User fills areas
    And User writes weak password "123"
    And User taps into Kayit Ol
    Then User see alert msg "Daha guclu sifre secin"


