import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProjectActivity4 extends BaseTest{
    @Test
    public void popularCourseTest(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement firstInfobox = driver.findElement(By.xpath("(//div/h3[@class='entry-title'])[2]"));
        String courseName = firstInfobox.getText();
        Assert.assertEquals("Email Marketing Strategies",courseName);

    }
}
