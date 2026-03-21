package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import tests.BaseTest;
import pages.LoginPage;
import utils.JsonUtils;

import java.util.List;
import java.util.Map;

@Listeners(tests.TestListener.class)
public class LoginTests extends BaseTest {

    // 🔥 DataProvider - reads JSON file
    @DataProvider(name = "loginData")
    public Object[][] getData() {

        List<Map<String, String>> data = JsonUtils.getTestData("loginData.json");

        Object[][] obj = new Object[data.size()][1];

        for (int i = 0; i < data.size(); i++) {
            obj[i][0] = data.get(i);
        }

        return obj;
    }

    // 🔥 Single Data-Driven Test
    @Test(dataProvider = "loginData")
    public void loginTest(Map<String, String> data) {

        LoginPage login = new LoginPage(driver);

        // Perform login using JSON data
        login.login(data.get("username"), data.get("password"));

        // Validate result
        if (data.get("expected").equals("Products")) {

            String text = login.getProductsText();
            Assert.assertEquals(text, "Products");

        } else {

            String error = login.getErrorMessage();
            Assert.assertTrue(error.contains("Epic sadface"));
        }
    }
}