package StepsDef;

import PageObjects.LoginStepsImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginStepsDef {

    WebDriver driver;

    @Given("^I am on DekoPay Website$")
    public void i_am_on_deko_pay_website() {

        LoginStepsImpl loginStepsObj = new LoginStepsImpl();
        loginStepsObj.openHomePage();
    }

    @When("^I enter my \"([^\"]*)\"$")
    public void i_enter_my(String username)
    {
        LoginStepsImpl loginStepsObj = new LoginStepsImpl();
        loginStepsObj.enterUsername(username);
    }

    @And("^I type my \"([^\"]*)\"$")
    public void type(String password)
    {
        LoginStepsImpl loginStepsObj = new LoginStepsImpl();
        loginStepsObj.typePassword(password);
    }

    @And("^I click sign in button$")
    public void i_click_sign_in_button()
    {
        LoginStepsImpl loginStepsObj = new LoginStepsImpl();
        loginStepsObj.SignInButton();
    }

    @Then("^I should see my dashboard$")
    public void i_should_see_my_dashboard()
    {
        LoginStepsImpl loginStepsObj = new LoginStepsImpl();
        loginStepsObj.verifyPageTitle();
    }

}
