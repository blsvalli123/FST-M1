import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ProjectActivity9 extends BaseTest {
    @Test
    public void coursesTest(){
//        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']")));
//
//        WebElement myAccountLink = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']"));
//        myAccountLink.click();
//        WebElement loginBtn = driver.findElement(By.xpath("//div/a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']"));
//        loginBtn.click();
//
//        WebElement usernametxtBox = driver.findElement(By.xpath("//input[@id='user_login']"));
//        WebElement passwordtxtBox = driver.findElement(By.xpath("//input[@id='user_pass']"));
//        WebElement signInBtn = driver.findElement(By.xpath(" //input[@id='wp-submit']"));
//        usernametxtBox.sendKeys("root");
//        passwordtxtBox.sendKeys("pa$$w0rd");
//        signInBtn.click();

        WebElement allCourses = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']"));
        allCourses.click();
        WebElement course = driver.findElement(By.xpath("(//div/h3[@class='entry-title'])[1]"));
        String CourseValue = course.getText();
        System.out.println("Playing "+CourseValue +" course");
        WebElement courseOpen = driver.findElement(By.xpath("(//p/a[@class='btn btn-primary'])[1]"));
        courseOpen.click();

        WebElement courseProgress = driver.findElement(By.xpath("(//div[@class='ld-item-title'])[1]"));
        courseProgress.click();
        WebElement courseHeading = driver.findElement(By.xpath("//h3/a[@id='ld-focus-mode-course-heading']"));
        String courseHeadingValue = courseHeading.getText();
        System.out.println("The course heading is: "+courseHeadingValue);

        Assert.assertEquals(CourseValue,courseHeadingValue);


    }
}
