package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginStepsImpl extends Base {

    WebDriver driver;
    String actualMessage = "Welcome to DekoPay";

    public void openHomePage() {}

    public void enterUsername(String username)
    {
        WebElement usernameField = driver.findElement(By.cssSelector("[type='text']"));
        usernameField.sendKeys("Lanre.Lawal");
    }

    public void typePassword(String password)
    {
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        passwordField.sendKeys("DekoQA2020");
    }

    public void SignInButton()
    {
        WebElement SignInBtn = driver.findElement(By.cssSelector("[type='submit']"));
        SignInBtn.click();
    }

    public void verifyPageTitle()
    {
            String expectedPageTitle = driver.getTitle();
            Assert.assertEquals(actualMessage, expectedPageTitle);
            //AssertThat(actualMessage, is(equalTo(expectedPageTitle)));
    }
}
