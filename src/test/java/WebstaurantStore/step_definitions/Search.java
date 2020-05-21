package WebstaurantStore.step_definitions;

import WebstaurantStore.pages.SearchTable;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Search {
    SearchTable search = new SearchTable();

    @Given("Go to https:\\/\\/www.webstaurantstore.com\\/")
    public void go_to_https_www_webstaurantstore_com() {
    }

    @Then("Search for {string}")
    public void search_for(String string) {
        search.searchBox(string);

    }

    @Then("Check the search result ensuring every product item has the word {string} its title")
    public void check_the_search_result_ensuring_every_product_item_has_the_word_its_title(String table) {
        search.resultOfSearch(table);
    }

    @Then("Add the last of found items to Cart")
    public void add_the_last_of_found_items_to_Cart() {
        search.addLastItemInCart();
    }

    @Then("Empty Cart")
    public void empty_Cart() {
        search.emptyCart();

    }

    @Then("Verify that {string} message is display")
    public void verify_that_message_is_display(String string) {
        Assert.assertEquals(string, search.confirmMessage());
        System.out.println("Message is: " + search.confirmMessage());
    }



}
