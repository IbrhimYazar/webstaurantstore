package WebstaurantStore.pages;

import WebstaurantStore.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class SearchTable extends BasePage{

    @FindBy (css = "[id='searchval']" )
    public WebElement searchBox;

    @FindBy (css= "[value='Search']")
    public WebElement submitButton;

    @FindBy (css = "[class='description']")
    public WebElement items;

    @FindBy (xpath = "//form[@class='product_form 600T2496G']//input[@class='btn btn-cart btn-small']")
    public WebElement lastItem;

    @FindBy (xpath = "//span[contains(text(),'Cart')]")
    public WebElement cart;

    @FindBy (css = "[class=\"emptyCartButton btn btn-mini btn-ui pull-right\"]")
    public WebElement emptyCart;

    @FindBy (xpath = "//button[contains(text(),'Empty Cart')]")
    public WebElement confirmEmptyCart;

    @FindBy (xpath = "//p[@class='header-1']")
    public WebElement confirmMessage;

    public void searchBox(String string){
        searchBox.click();
        searchBox.sendKeys(string);
        submitButton.click();
    }

    public void resultOfSearch(String listingTable){

        //Storing all the results in List and comparing all the results not contains Table
        List<WebElement> list = Driver.get().findElements(By.cssSelector("[class=\"details\"]"));
        int count = 0;
        int noneTable = 0;
        for (WebElement each : list) {
            if(! each.getText().contains(listingTable)){
                noneTable ++;
            }

            count ++;
        }
        Wait(5000);
        System.out.println( noneTable + " listing does not contain \"Table\" ");
        System.out.println(count+" \"Table\" was found");

    }

    public void addLastItemInCart(){
      lastItem.click();

    }

    public void emptyCart(){
        cart.click();
        emptyCart.click();
        Wait(3000);
        confirmEmptyCart.click();

    }

    public String confirmMessage(){
        Wait(2000);
       String message=  confirmMessage.getText();
        return message;
    }

}
