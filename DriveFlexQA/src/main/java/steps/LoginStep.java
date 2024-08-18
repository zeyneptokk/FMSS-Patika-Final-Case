package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginStep {
    static AppiumDriver driver;
    LoginPage loginPage;

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
        loginPage = new LoginPage();
        loginPage.clickGirisYapLaunchScreenButton(driver);
    }

    //login1
    @Given("User opens app and click Giris Yap")
    public void userOpensAppAndClickGirisYap() {
        optionMethod();
        driver.findElement(loginPage.girisYapLaunchScreenLoc).click();
    }

    @And("User fills email {string}")
    public void userFillsEmail(String arg0) {
        loginPage.fillEmail("johndoe@example.com",driver);
    }

    @And("User fills password {string}")
    public void userFillsPassword(String arg0) {
        loginPage.fillPassword("********",driver);
    }

    @And("User clicks Giris Yap button")
    public void userClicksGirisYapButton() {
        loginPage.clickGirisYapButton(driver);
    }

    @Then("User redirected to Anasayfa page")
    public void userRedirectedToAnasayfaPage() {
        loginPage.verifyGirisYapTitle("Giris Yap", driver);
    }

    //login2
    @Given("User opens app and comes Giris Yap")
    public void userOpensAppAndComesGirisYap() {
        optionMethod();
    }

    @And("User fills email with {string}")
    public void userFillsEmailWith(String arg0) {
        loginPage.invalidEmail("invalidEmail",driver);
    }

    @And("User fills password field {string}")
    public void userFillsPasswordField(String arg0) {
        loginPage.fillPassword("********",driver);
    }

    @And("User taps Giris Yap button")
    public void userTapsGirisYapButton() {
        loginPage.clickGirisYapButton(driver);
    }

    @Then("User should see message {string}")
    public void userShouldSeeMessage(String arg0) {
        loginPage.setAlertMessage("Yanlis email",driver);
    }

    //login3
    @Given("User opens app and goes to Giris Yap")
    public void userOpensAppAndGoesToGirisYap() {
        optionMethod();
    }

    @And("User writes email {string}")
    public void userWritesEmail(String arg0) {
        loginPage.fillEmail("johndoe@example.com",driver);
    }

    @And("User writes password {string}")
    public void userWritesPassword(String arg0) {
        loginPage.invalidPassword("wrongpassword", driver);
    }

    @And("User clicks Giris Yap")
    public void userClicksGirisYap() {
        loginPage.clickGirisYapButton(driver);
    }

    @Then("User see message {string}")
    public void userSeeMessage(String arg0) {
        loginPage.setAlertMessage("Sifreniz yanlis", driver);
    }

    //login4
    @Given("User opens app and goes into Giris Yap")
    public void userOpensAppAndGoesIntoGirisYap() {
        optionMethod();
    }

    @And("User leaves empty email area")
    public void userLeavesEmptyEmailArea() {
        loginPage.fillEmail("",driver);
    }

    @And("User leaves empty password area")
    public void userLeavesEmptyPasswordArea() {
        loginPage.fillPassword("",driver);
    }

    @And("User clicks to Giris Yap button")
    public void userClicksToGirisYapButton() {
        loginPage.clickGirisYapButton(driver);
    }

    @Then("User sees message {string}")
    public void userSeesMessage(String arg0) {
        loginPage.setAlertMessage("Alanlari doldurunuz", driver);
    }

    //login5
    @Given("User opens app and comes into Giris Yap screen")
    public void userOpensAppAndComesIntoGirisYapScreen() {
        optionMethod();
    }

    @And("User tries to write {string}")
    public void userTriesToWrite(String arg0) {
        loginPage.fillEmail("example@example.com",driver);
    }

    @And("User writes {string}")
    public void userWrites(String arg0) {
        loginPage.fillPassword("passsword",driver);
    }

    @And("User tap on Giris Yap button")
    public void userTapOnGirisYapButton() {
        loginPage.clickGirisYapButton(driver);
    }

    @Then("User sees this message {string}")
    public void userSeesThisMessage(String arg0) {
        loginPage.setAlertMessage("Kayitli kullanici bulunamadi", driver);
    }
}
