import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProjectActivity2 extends BaseTest{
    @Test
    public void headerTest(){

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h1[@class='uagb-ifb-title']")));
        WebElement header = driver.findElement(By.xpath("//div/h1[@class='uagb-ifb-title']"));
        Assert.assertEquals("Learn from Industry Experts",header.getText());

    }
}
