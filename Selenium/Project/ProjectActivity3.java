import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProjectActivity3 extends BaseTest{
    @Test
    public void firstInfoBoxtest(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstInfobox = driver.findElement(By.xpath("(//div/h3[@class='uagb-ifb-title'])[1]"));
        Assert.assertEquals("Actionable Training",firstInfobox.getText());

    }


}
