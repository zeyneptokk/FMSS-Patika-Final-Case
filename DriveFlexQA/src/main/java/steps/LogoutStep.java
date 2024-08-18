package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LogoutPage;

import java.net.MalformedURLException;
import java.net.URL;

public class LogoutStep {
    static AppiumDriver driver;
    LogoutPage logoutPage;


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
        logoutPage = new LogoutPage();
        logoutPage.userLoggedIn(driver);
        }
        
    @Given("User logged into app")
    public void userLoggedIntoApp() {
        optionMethod();
    }

    @And("User is on profile page")
    public void userIsOnProfilePage() {
        logoutPage.userIsInProfilePage(driver);
    }

    @And("User clicks to Cikis Yap button")
    public void userClicksToCikisYapButton() {
        logoutPage.clickCikisYapButton(driver);
    }

    @And("User sees alert {string}")
    public void userSeesAlert(String arg0) {
        logoutPage.displayedAlertMessage("Cikis yapmak istediginize emin misiniz", driver);
    }

    @And("User clicks Evet")
    public void userClicksEvet() {
        logoutPage.clickEvetAlertButton(driver);
    }

    @Then("User is redirected to launch screen")
    public void userIsRedirectedToLaunchScreen() {
        logoutPage.navigatedToLaunchScreen(driver);
        Assert.assertEquals("Hosgeldiniz", driver.getTitle());
    }

    //scenario2
    @Given("User logged in the app")
    public void userLoggedInTheApp() {
        optionMethod();
    }

    @And("User is in the profile screen")
    public void userIsInTheProfileScreen() {
        logoutPage.userIsInProfilePage(driver);
    }

    @And("User taps cikis Yap button")
    public void userTapsCikisYapButton() {
        logoutPage.clickCikisYapButton(driver);
    }

    @And("User sees alert message {string}")
    public void userSeesAlertMessage(String arg0) {
        logoutPage.displayedAlertMessage("Cikis yapmak istediginize emin misiniz", driver);
    }

    @And("User clicks Hayır")
    public void userClicksHayır() {
        logoutPage.clickHayırAlertButton(driver);
    }

    @Then("User is redirected to anasayfa")
    public void userIsRedirectedToAnasayfa() {
        logoutPage.navigatedToAnasayfaScreen(driver);
        Assert.assertEquals("Anasayfa", driver.getTitle());
    }
}
