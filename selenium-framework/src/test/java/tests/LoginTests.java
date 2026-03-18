package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import base.BaseTest;
import pages.LoginPage;
import utils.WaitUtils;

@Listeners(utils.TestListener.class)
public class LoginTests extends BaseTest {

    @Test(retryAnalyzer = utils.RetryAnalyzer.class)
    public void validLoginTest() {

        LoginPage login = new LoginPage(driver);

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();

        By products = By.xpath("//span[text()='Products']");

        String text = WaitUtils.waitForElement(driver, products, 10).getText();

        System.out.println("Page title: " + text);

        Assert.assertEquals(text, "Products");
       
    }

    @Test(retryAnalyzer = utils.RetryAnalyzer.class)
    public void invalidLoginTest() {

        LoginPage login = new LoginPage(driver);

        login.enterUsername("wrong_user");
        login.enterPassword("wrong_pass");
        login.clickLogin();

        By error = By.xpath("//h3[contains(text(),'Epic sadface')]");

        String errorMsg = WaitUtils.waitForElement(driver, error, 10).getText();

        System.out.println("Error: " + errorMsg);

        Assert.assertTrue(errorMsg.contains("Epic sadface"));
    }
}