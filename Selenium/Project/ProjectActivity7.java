import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ProjectActivity7 extends BaseTest{
@Test
    public void coursesTest(){
    WebElement allCourses = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']"));
    allCourses.click();
    List<WebElement> coursesList = driver.findElements(By.xpath("//div/h3[@class='entry-title']"));
    System.out.println("Number of Courses on the site are : "+coursesList.size());
}
}
