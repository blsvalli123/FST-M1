import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public static WebDriver driver ;
    public static WebDriverWait wait;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.gecko.driver", "C:/Users/LakshmiSrivalliBhrug/IdeaProjects/geckodriver.exe");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
