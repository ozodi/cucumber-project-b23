package com.cydeo.step_definitions;

import com.cydeo.pages.LibLoginPage;
import com.cydeo.utility.BrowserUtil;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LibraryLoginStepDef {
    LibLoginPage loginPage = new LibLoginPage();
    @Given("user is at library login page")
    public void userIsAtLibraryLoginPage() {

        loginPage.goTo();
    }


    @When("user user username {string} and passcode {string}")
    public void userUserUsernameAndPasscode(String email, String password) {
        loginPage.login(email,password);

    }


    @Then("user should be at dashboard page")
    public void userShouldBeAtDashboardPage() {

        // check the title is now library after logging in
        BrowserUtil.waitFor(1);

        assertEquals("Library", Driver.getDriver().getTitle() );

    }


}
