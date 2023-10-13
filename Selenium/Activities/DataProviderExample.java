package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderExample {
    WebDriver driver;
    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.gecko.driver", "C:/Users/LakshmiSrivalliBhrug/IdeaProjects/geckodriver.exe");

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");

        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/login-form");

    }

    @DataProvider(name="credentials")
    public static Object[][] credentials(){
        return new Object[][]{
                {"admin","password","Welcome Back, admin"},
                {"user1","password1","Invalid Credentials"}

        };
    }

    @Test(dataProvider="credentials")
    public void loginTest(String userName,String password, String message){
        WebElement userNameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit'] "));

        userNameField.clear();
        passwordField.clear();

        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage,message);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
