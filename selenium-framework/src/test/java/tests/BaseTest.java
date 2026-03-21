package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp() {

        ConfigReader.loadConfig();

        String browser = ConfigReader.get("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");

            driver = new ChromeDriver(options);
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.get("url"));
    }

    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(2000); // reduced wait for CI
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}