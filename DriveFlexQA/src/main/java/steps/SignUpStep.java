package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.SignUpPage;

import java.net.MalformedURLException;
import java.net.URL;

public class SignUpStep {
    static AppiumDriver driver;
    SignUpPage signUpPage;

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void optionMethod() {
        var options = new BaseOptions()
                .amend("platformName", "Android")
                .amend("appium:deviceName", "Pixel 6 Pro API 35")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:udid", "Android Emulator")
                .amend("appium:avd", "Pixel_6_Pro_API_35")
                .amend("appium:fastReset", true)
                .amend("appium:newCommandTimeout", 5)
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:connectHardwareKeyboard", true)
                .amend("appium:app", "/Users/zeynep/Desktop/app/driveflex-test-app.apk");

        driver = new AndroidDriver(this.getUrl(), options);
       SignUpPage signUpPage = new SignUpPage();
       signUpPage.clickKayitOlLaunchScreenButton(driver);
    }

    //Scenario1
    @Given("User opens app and clicks Kayit Ol")
    public void userOpensAppAndClicksKayitOl() {
        optionMethod();
    }

    @And("User fills all areas with valid info")
    public void userFillsAllAreasWithValidInfo() {
        signUpPage.fillFirstName("John",driver);
        signUpPage.fillLastName("Doe",driver);
        signUpPage.fillTcknPassportNum("11111111111", driver);
        signUpPage.fillEmail("johndoe@example.com", driver);
        signUpPage.fillPhoneNum("5355555555", driver);
        signUpPage.fillPassword("********", driver);
    }

    @And("User checks KVKK box")
    public void userChecksKVKKBox() {
        signUpPage.clickKvkkCheckBox(driver);
    }

    @And("User clicks Kayit Ol")
    public void userClicksKayitOl() {
        signUpPage.clickKayitOlButton(driver);
    }

    @Then("User is navigated to OTP screen")
    public void userIsNavigatedToOTPScreen() {
        signUpPage.displayedOtpScreenTitle(driver);
        Assert.assertEquals("Dogrulama Yap", driver.getTitle());
    }

    //Scenario2
    @Given("User opens app and comes Kayit Ol")
    public void userOpensAppAndComesKayitOl() {
        optionMethod();
    }

    @And("User leaves phone number area empty")
    public void userLeavesPhoneNumberAreaEmpty() {
        signUpPage.fillFirstName("John",driver);
        signUpPage.fillLastName("Doe",driver);
        signUpPage.fillTcknPassportNum("11111111111", driver);
        signUpPage.fillEmail("johndoe@example.com", driver);
        signUpPage.fillPhoneNum("", driver);
        signUpPage.fillPassword("********", driver);
    }

    @And("User clicks Kayit Ol button")
    public void userClicksKayitOlButton() {
        signUpPage.clickKayitOlButton(driver);
    }

    @Then("User see error {string}")
    public void userSeeError(String arg0) {
        signUpPage.displayedAlertTitle(driver);
        Assert.assertEquals("Alanlar bos birakilamaz", driver.getTitle());
    }

    //Scenario3
    @Given("User is in app and Kayit Ol")
    public void userIsInAppAndKayitOl() {
        optionMethod();
    }

    @And("User fills areas with valid info")
    public void userFillsAreasWithValidInfo() {
        signUpPage.fillFirstName("John",driver);
        signUpPage.fillLastName("Doe",driver);
        signUpPage.fillTcknPassportNum("11111111111", driver);
        signUpPage.fillEmail("johndoe@example.com", driver);
        signUpPage.fillPhoneNum("5355555555", driver);
        signUpPage.fillPassword("********", driver);
    }

    @And("User clicks Kayit button")
    public void userClicksKayitButton() {
        signUpPage.clickKayitOlButton(driver);
    }

    @Then("User see msg {string}")
    public void userSeeMsg(String arg0) {
        signUpPage.displayedAlertTitle(driver);
        Assert.assertEquals("KVKK onaylamalisiniz", driver.getTitle());
    }

    //Scenario4
    @Given("User is on the app and in Kayit Ol")
    public void userIsOnTheAppAndInKayitOl() {
        optionMethod();
    }

    @And("User writes email area {string}")
    public void userWritesEmailArea(String arg0) {
        signUpPage.fillFirstName("John",driver);
        signUpPage.fillLastName("Doe",driver);
        signUpPage.fillTcknPassportNum("11111111111", driver);
        signUpPage.fillEmail("exam@com", driver);
        signUpPage.fillPhoneNum("5355555555", driver);
        signUpPage.fillPassword("********", driver);
    }

    @And("User taps Kayit Ol")
    public void userTapsKayitOl() {
        signUpPage.clickKayitOlButton(driver);
    }

    @Then("User see {string}")
    public void userSee(String arg0) {
        signUpPage.displayedAlertTitle(driver);
        Assert.assertEquals("Email formati yanlis", driver.getTitle());
    }

    //Scenario5
    @Given("User launches app and in Kayit Ol screen")
    public void userLaunchesAppAndInKayitOlScreen() {
        optionMethod();
    }

    @And("User fills areas")
    public void userFillsAreas() {
        signUpPage.fillFirstName("John",driver);
        signUpPage.fillLastName("Doe",driver);
        signUpPage.fillTcknPassportNum("11111111111", driver);
        signUpPage.fillEmail("exam@com", driver);
        signUpPage.fillPhoneNum("5355555555", driver);

    }

    @And("User writes weak password {string}")
    public void userWritesWeakPassword(String arg0) {
        signUpPage.fillPassword("123", driver);
    }

    @And("User taps into Kayit Ol")
    public void userTapsIntoKayitOl() {
        signUpPage.clickKayitOlButton(driver);
    }

    @Then("User see alert msg {string}")
    public void userSeeAlertMsg(String arg0) {
        signUpPage.displayedAlertTitle(driver);
        Assert.assertEquals("Guclu sifre secmelisiniz", driver.getTitle());

    }
}
