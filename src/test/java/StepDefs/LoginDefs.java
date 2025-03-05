package StepDefs;

import Pages.BasePage;
import Pages.HomePage;
import Pages.SigninPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static Utilities.DriverSetup.getDriver;

public class LoginDefs {
    BasePage basePage = new BasePage();
    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();

    @Given("User should be on the login page")
    public void userShouldBeOnTheLoginPage() {
        getDriver().get(homePage.homepageUrl);
        signinPage.clickOnElement(homePage.signin);
    }

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword() throws InterruptedException {
        signinPage.writeOnElement(signinPage.emailField, "shobuj@yopmail.com");
        signinPage.writeOnElement(signinPage.passwordField, "shobuj1234");
    }

//    @And("User click on eye button beside password")
//    public void userClickOnEyeButtonBesidePassword() throws InterruptedException {
//        signinPage.clickOnElement(signinPage.maskPassword);
//        Thread.sleep(2000);
//    }

    @And("User click on the sign in button")
    public void userClickOnTheSignInButton() throws InterruptedException {
        signinPage.clickOnElement(signinPage.signinButton);
        Thread.sleep(2000);
    }

    @Then("User should be on the home page")
    public void userShouldBeOnTheHomePage() throws InterruptedException {
        Assert.assertEquals(getDriver().getCurrentUrl(), homePage.homepageUrl);
    }


    @When("user enter valid email")
    public void userEnterValidEmail() throws InterruptedException {
        signinPage.writeOnElement(signinPage.emailField, "shobuj1111@yopmail.com");
        Thread.sleep(2000);
    }

    @And("user enter invalid password")
    public void userEnterInvalidPassword() throws InterruptedException{
        signinPage.writeOnElement(signinPage.passwordField, "incorrectPass");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() throws InterruptedException {
        Assert.assertEquals(signinPage.getElementText(signinPage.errorMgs),"The provided credentials are incorrect.");
    }
}
