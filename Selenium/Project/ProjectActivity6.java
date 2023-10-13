import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProjectActivity6 extends BaseTest{
    @Test
    public void loginTest(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']")));

        WebElement myAccountLink = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
        myAccountLink.click();
        WebElement loginBtn = driver.findElement(By.xpath("//div/a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']"));
        loginBtn.click();

        WebElement usernametxtBox = driver.findElement(By.xpath("//input[@id='user_login']"));
        WebElement passwordtxtBox = driver.findElement(By.xpath("//input[@id='user_pass']"));
        WebElement signInBtn = driver.findElement(By.xpath(" //input[@id='wp-submit']"));
        usernametxtBox.sendKeys("root");
        passwordtxtBox.sendKeys("pa$$w0rd");
        signInBtn.click();
        WebElement username = driver.findElement(By.xpath("(//a/span[@class='display-name'])[1]"));
        Assert.assertEquals("root",username.getText());

    }
}
