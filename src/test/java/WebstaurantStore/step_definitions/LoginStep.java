package WebstaurantStore.step_definitions;

import WebstaurantStore.pages.LoginSwagLabs;
import WebstaurantStore.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @Then("User verify that page title {string}")
    public void user_verify_that_page_title(String string) {
      loginSwagLabs.verifyPageTitle(string);
    }

    @Given("User Should click dropdown box")
    public void user_Should_click_dropdown_box() {
        loginSwagLabs.clickDropDownBox();

    }

    @Then("User should click Price \\(Low to High) option")
    public void user_should_click_Price_Low_to_High_option() {
        loginSwagLabs.selectPriceLowToHigh();
    }

//    @Then("Verify that dropdown box has {string} text")
//    public void verify_that_dropdown_box_has_text(String string) {
//        loginSwagLabs.dropDownBoxText(string);
//    }

    @When("User click ADD TO CARD button")
    public void user_click_ADD_TO_CARD_button() {
        loginSwagLabs.clickAddToCartButton();
    }

    @Then("User click cart icon")
    public void user_click_cart_icon() {
        loginSwagLabs.clickCartButton();
    }

    @Then("Verify that user in the cart page")
    public void verify_that_user_in_the_cart_page() {
        loginSwagLabs.verifyCartPage();
    }

    @Then("User click CHECKOUT button")
    public void user_click_CHECKOUT_button() {
        loginSwagLabs.clickCheckoutButton();
    }

    @Then("User click CONTINUE button")
    public void user_click_CONTINUE_button() {
        loginSwagLabs.clickContinueButton();
    }

    @Then("User should see {string} error message")
    public void user_should_see_error_message(String string) {
        loginSwagLabs.errorMessage(string);
    }


}
