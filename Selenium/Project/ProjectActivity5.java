import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProjectActivity5 extends BaseTest{
    @Test
    public void myAccountTitle(){

       WebElement myAccountLink = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
       myAccountLink.click();
       String pageTitle = driver.getTitle();
       System.out.println(pageTitle);
       Assert.assertEquals("My Account – Alchemy LMS",pageTitle);
    }

}
