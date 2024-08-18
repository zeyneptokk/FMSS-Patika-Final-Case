package pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    public final By girisYapLaunchScreenLoc = By.id("");
    public final By emailLoc = By.id("");
    public final By passwordLoc = By.id("");
    public final By girisYapButtonLoc = By.id("");
    public final By girisYapTitleLoc = By.id("");
    public final By alertMessageLoc = By.id("");

    private WebElement emailElement(WebDriver driver) {
        WebElement emailEl = driver.findElement(emailLoc);
        return emailEl;
    }
    private WebElement passwordElement(WebDriver driver) {
        WebElement passwordEl = driver.findElement(passwordLoc);
        return passwordEl;
    }

    private WebElement girisYapLaunchScreenElement(WebDriver driver) {
        WebElement girisYapLaunchScreenEl = driver.findElement(girisYapLaunchScreenLoc);
        return girisYapLaunchScreenEl;
    }

    private WebElement girisYapButtonElement(WebDriver driver) {
        WebElement girisYapButtonEl = driver.findElement(girisYapButtonLoc);
        return girisYapButtonEl;
    }
    private WebElement girisYapTitleElement(WebDriver driver) {
        WebElement girisYapTitleEl = driver.findElement(girisYapTitleLoc);
        return girisYapTitleEl;
    }

    private WebElement alertMessageElement(WebDriver driver) {
        WebElement alertMsgEl = driver.findElement(alertMessageLoc);
        return alertMsgEl;
    }

    public void clickGirisYapLaunchScreenButton(WebDriver driver) {
        girisYapLaunchScreenElement(driver).click();
    }
    public void fillEmail(String email, WebDriver driver) {
        emailElement(driver).sendKeys(email);
    }
    public void fillPassword(String password, WebDriver driver) {
        passwordElement(driver).sendKeys(password);
    }
    public void clickGirisYapButton(WebDriver driver) {
        girisYapButtonElement(driver).click();
    }
    public void verifyGirisYapTitle(String title, WebDriver driver) {
        Assert.assertEquals("Giris Yap",girisYapTitleElement(driver).getText());
    }
    public void invalidEmail(String email, WebDriver driver) {
        emailElement(driver).sendKeys(email);
    }
    public void setAlertMessage(String message, WebDriver driver) {
        alertMessageElement(driver).sendKeys(message);
    }
    public void invalidPassword(String password, WebDriver driver) {
        passwordElement(driver).sendKeys(password);
    }

}
