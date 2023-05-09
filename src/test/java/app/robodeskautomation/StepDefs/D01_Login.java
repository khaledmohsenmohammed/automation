package app.robodeskautomation.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D01_Login {
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("I am on the login page");
    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
