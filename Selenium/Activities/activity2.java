package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Users/LakshmiSrivalliBhrug/IdeaProjects/geckodriver.exe");

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/login-form");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username field and enter the username
        driver.findElement(By.id("username")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.id("password")).sendKeys("password");
        // Find the login button and click it
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        // Print the confirmation message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.close();

    }
}
