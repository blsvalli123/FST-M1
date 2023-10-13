package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Test print");
//        Install the web driver manager
//        WebDriverManager.firefoxdriver().setup();
        System.setProperty("webdriver.gecko.driver", "C:/Users/LakshmiSrivalliBhrug/IdeaProjects/geckodriver.exe");

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");

//        Initilaize the driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find About Us link using id and click it
        driver.findElement(By.id("about-link")).click();
        // Print the title of the new page
        System.out.println("About page title: " + driver.getTitle());

        Thread.sleep(50000);

        driver.quit();


    }
}
