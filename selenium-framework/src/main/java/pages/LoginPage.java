package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // 🔹 Locators (PageFactory)

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(xpath = "//span[text()='Products']")
    WebElement productsText;

    @FindBy(xpath = "//h3[contains(text(),'Epic sadface')]")
    WebElement errorMessage;

    // 🔹 Actions

    public void enterUsername(String user) {
        WaitUtils.waitForElementVisible(driver, username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        WaitUtils.waitForElementVisible(driver, password).sendKeys(pass);
    }

    public void clickLogin() {
        WaitUtils.waitForElementClickable(driver, loginBtn).click();
    }

    // 🔥 Combined method (used in test)
    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }

    // 🔥 Validation methods

    public String getProductsText() {
        return WaitUtils.waitForElementVisible(driver, productsText).getText();
    }

    public String getErrorMessage() {
        return WaitUtils.waitForElementVisible(driver, errorMessage).getText();
    }
}