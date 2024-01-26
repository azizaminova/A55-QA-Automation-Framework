import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;



class RegistrationTest {
    private WebDriver driver;

    @Test
    public void Registration() {

        WebElement registrationLink = driver.findElement(By.linkText("Registration"));
        registrationLink.click();

        String expectedTitle = "Registration Page";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        driver.quit();
    }

}
