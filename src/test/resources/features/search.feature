Feature: Check the search result

  @Search
  Scenario: Verify every product has "Table"
    Given Go to https://www.webstaurantstore.com/
    Then Search for "stainless work table"
    And Check the search result ensuring every product item has the word "Table" its title
    And Add the last of found items to Cart
    Then Empty Cart
    And Verify that "Your cart is empty." message is display

