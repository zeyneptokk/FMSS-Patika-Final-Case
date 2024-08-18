package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

    private final By kayitOlLaunchScreenButtonLoc = By.id("");
    private final By firstNameloc = By.id("");
    private final By lastNameLoc = By.id("");
    private final By tcknPassportNumLoc = By.id("");
    private final By emailLoc = By.id("");
    private final By phoneNumLoc = By.id("");
    private final By passwordLoc = By.id("");
    private final By kvkkCheckBoxLoc = By.id("");
    private final By kayitOlButtonLoc = By.id("");
    private final By otpScreenTitleLoc = By.id("");
    private final By alertTitleLoc = By.id("");

    private WebElement kayitOlLaunchScreenButtonEl(WebDriver driver) {
        WebElement kayitOlLaunchScreenButtonEl = driver.findElement(kayitOlLaunchScreenButtonLoc);
        return kayitOlLaunchScreenButtonEl;
    }
    private WebElement firstNameElement(WebDriver driver){
        WebElement firstNameEl = driver.findElement(firstNameloc);
        return firstNameEl;
    }
    private WebElement lastNameElement(WebDriver driver){
        WebElement lastNameEl = driver.findElement(lastNameLoc);
        return lastNameEl;
    }
    private WebElement tcknPassportNumElement(WebDriver driver){
        WebElement tcknPassportNumEl = driver.findElement(tcknPassportNumLoc);
        return tcknPassportNumEl;
    }
    private WebElement emailElement(WebDriver driver){
        WebElement emailEl = driver.findElement(emailLoc);
        return emailEl;
    }
    private WebElement phoneNumElement(WebDriver driver){
        WebElement phoneNumEl = driver.findElement(phoneNumLoc);
        return phoneNumEl;
    }
    private WebElement passwordElement(WebDriver driver){
        WebElement passwordEl = driver.findElement(passwordLoc);
        return passwordEl;
    }
    private WebElement kvkkCheckBoxElement(WebDriver driver){
        WebElement kvkkCheckBoxEl = driver.findElement(kvkkCheckBoxLoc);
        return kvkkCheckBoxEl;
    }
    private WebElement kayitOlButtonElement(WebDriver driver){
        WebElement kayitOlButtonEl = driver.findElement(kayitOlButtonLoc);
        return kayitOlButtonEl;
    }
    private  WebElement otpScreenTitleElement(WebDriver driver){
        WebElement otpScreenTitleEl = driver.findElement(otpScreenTitleLoc);
        return otpScreenTitleEl;
    }
    private WebElement alertTitleElement(WebDriver driver){
        WebElement alertTitleEl = driver.findElement(alertTitleLoc);
        return alertTitleEl;
    }

    public void clickKayitOlLaunchScreenButton(WebDriver driver){
        kayitOlLaunchScreenButtonEl(driver).click();
    }
    public void fillFirstName(String firstName, WebDriver driver) {
        firstNameElement(driver).sendKeys(firstName);
    }
    public void fillLastName(String lastName, WebDriver driver) {
        lastNameElement(driver).sendKeys(lastName);
    }
    public void fillTcknPassportNum(String tcknPassportNum, WebDriver driver) {
        tcknPassportNumElement(driver).sendKeys(tcknPassportNum);
    }
    public void fillEmail(String email, WebDriver driver) {
        emailElement(driver).sendKeys(email);
    }
    public void fillPhoneNum(String phoneNum, WebDriver driver) {
        phoneNumElement(driver).sendKeys(phoneNum);
    }
    public void fillPassword(String password, WebDriver driver) {
        passwordElement(driver).sendKeys(password);
    }
    public void clickKvkkCheckBox(WebDriver driver) {
        kvkkCheckBoxElement(driver).click();
    }
    public void clickKayitOlButton(WebDriver driver) {
        kayitOlButtonElement(driver).click();
    }
    public void displayedOtpScreenTitle(WebDriver driver) {
        otpScreenTitleElement(driver).getText();
    }
    public void displayedAlertTitle(WebDriver driver) {
        alertTitleElement(driver).getText();
    }

}
