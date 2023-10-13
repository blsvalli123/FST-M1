import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectActivity1 extends BaseTest{

    //    public static void main(String[] args) {
    @Test
    public void titleTest() {


        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        Assert.assertEquals("Alchemy LMS – An LMS Application", driver.getTitle());

    }
}
