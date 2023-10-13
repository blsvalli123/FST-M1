package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGExample {

    WebDriver driver;
    @BeforeClass
    public void setup(){

        System.setProperty("webdriver.gecko.driver", "C:/Users/LakshmiSrivalliBhrug/IdeaProjects/geckodriver.exe");

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");

        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/");

    }

    @Test (priority = 1)
    public void homePageTest(){
        String heading = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(heading,"Training Support");
    }

    @Test (dependsOnMethods = "homePageTest")
    public void aboutUsTest(){
        driver.findElement(By.id("about-link")).click();
        Assert.assertEquals(driver.getTitle(),"About Training Support");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
