package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    public final By emailFieldLoc = By.id("");
    public final By passwordFieldLoc = By.id("");
    public final By girisButtonLoc = By.id("");
    public final By profileButtonLoc = By.id("");
    public final By cikisYapButton = By.id("");
    public final By alertMessageLoc = By.id("");
    public final By alertEvetButtonLoc = By.id("");
    public final By alertHayırButtonLoc = By.id("");
    public final By launchScreenLabelLoc = By.id("");
    public final By anasayfaScreenTitleLoc = By.id("");

    private WebElement emailFieldElement(WebDriver driver) {
        return driver.findElement(emailFieldLoc);
    }
    private WebElement passwordFieldElement(WebDriver driver) {
        return driver.findElement(passwordFieldLoc);
    }
    private WebElement girisButtonElement(WebDriver driver) {
        return driver.findElement(cikisYapButton);
    }
    private WebElement profileButtonElement(WebDriver driver) {
        return driver.findElement(profileButtonLoc);
    }
    private WebElement cikisYapButtonElement(WebDriver driver) {
        WebElement cikisYapButtonEl = driver.findElement(cikisYapButton);
        return cikisYapButtonEl;
    }
    private WebElement alertMessageElement(WebDriver driver) {
        WebElement alertMessageEl = driver.findElement(alertMessageLoc);
        return alertMessageEl;
    }
    private WebElement alertEvetButtonElement(WebDriver driver) {
        WebElement alertEvetButtonEl = driver.findElement(alertEvetButtonLoc);
        return alertEvetButtonEl;
    }
    private WebElement launchScreenElement(WebDriver driver) {
        WebElement launchScreenEl = driver.findElement(launchScreenLabelLoc);
        return launchScreenEl;
    }
    private WebElement alertHayırButtonElement(WebDriver driver) {
        WebElement alertHayırButtonEl = driver.findElement(alertHayırButtonLoc);
        return alertHayırButtonEl;
    }
    private WebElement anasayfaScreenTitleElement(WebDriver driver) {
        WebElement anasayfaScreenTitleEl = driver.findElement(anasayfaScreenTitleLoc);
        return anasayfaScreenTitleEl;
    }

    public void userLoggedIn(WebDriver driver) {
        emailFieldElement(driver).findElement(emailFieldLoc).sendKeys("johndoe@example.com");
        passwordFieldElement(driver).findElement(passwordFieldLoc).sendKeys("********");
        girisButtonElement(driver).findElement(girisButtonLoc).click();

    }
    public void userIsInProfilePage(WebDriver driver) {
        profileButtonElement(driver).findElement(profileButtonLoc).click();
    }
    public void clickCikisYapButton(WebDriver driver) {
        cikisYapButtonElement(driver).click();
    }
    public void displayedAlertMessage(String message, WebDriver driver) {
        Assert.assertEquals("Cikis yapmak istediginize emin misiniz", alertMessageElement(driver).getText());
    }
    public void clickEvetAlertButton(WebDriver driver) {
        alertEvetButtonElement(driver).click();
    }
    public void navigatedToLaunchScreen(WebDriver driver) {
        launchScreenElement(driver).getText();
    }
    public void clickHayırAlertButton(WebDriver driver) {
        alertHayırButtonElement(driver).click();
    }
    public void navigatedToAnasayfaScreen(WebDriver driver) {
        anasayfaScreenTitleElement(driver).getText();
    }

}
