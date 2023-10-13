import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProjectActivity8 extends BaseTest{
    @Test
    public void cotactTest(){
        WebElement contactLink = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/contact/']"));
        contactLink.click();
        WebElement fullNameTxtbox = driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']"));
        WebElement emailTxtbox = driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']"));
        WebElement messageTextArea = driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']"));
        WebElement sendMessageBtn = driver.findElement(By.xpath("//button[@class='wpforms-submit ']"));
        fullNameTxtbox.sendKeys("FST Test Team");
        emailTxtbox.sendKeys("fsttestTeam@gmail.com");
        messageTextArea.sendKeys("Great Courses. Thank you !!");
        sendMessageBtn.click();

        WebElement confirmationMessage = driver.findElement(By.xpath("//div[@class='wpforms-confirmation-container wpforms-confirmation-scroll']/p"));
        System.out.println("The message shown by the page is : "+confirmationMessage.getText());

    }
}
