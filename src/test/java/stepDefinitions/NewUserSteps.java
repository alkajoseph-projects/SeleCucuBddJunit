package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static pages.NewUserRegPage.*;
import static pages.NewUserRegPage.verifyNewUserRegSuccess;

public class NewUserSteps {

    @When("User clicks on New user registration")
    public void userClicksOnNewUserRegistration() {
        clickOnRegister();
    }

    @And("User enters details")
    public void userEntersDetails() {
        clickOnSalutation();
        enterFirstname();
        enterLastname();
        enterEmail();
        enterContact();
        enterUsername();
        enterPassword();
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        clickOnSubmit();
    }

    @Then("User should see the registration is successful")
    public static void verifyNewUserReg(){
        String userRegSuccess = verifyNewUserRegSuccess();
        Assert.assertEquals(userRegSuccess,"User Registered Successfully !!!");
    }
}
