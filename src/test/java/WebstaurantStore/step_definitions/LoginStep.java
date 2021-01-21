package WebstaurantStore.step_definitions;

import WebstaurantStore.pages.LoginSwagLabs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep {

    LoginSwagLabs loginSwagLabs = new LoginSwagLabs();


    @Given("User on login page")
    public void user_on_login_page() {

    }

    @Then("user input username")
    public void user_input_username() {
        loginSwagLabs.enterUserName();
    }

    @Then("user input password")
    public void user_input_password() {
        loginSwagLabs.enterPassword();
    }

    @Then("user click login button")
    public void user_click_login_button() {
        loginSwagLabs.clickLoginButton();
    }

    @Then("Validate successful login to the website")
    public void validate_successful_login_to_the_website() {

       // System.out.println("workds");
    }

}
