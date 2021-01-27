package SwagLabPOM.pages;

import SwagLabPOM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginSwagLabs extends BasePage{

    @FindBy (xpath = "// input [ @ id=\"user-name\"]")
    WebElement userNameBoxElement;
    @FindBy (xpath = "// input [ @ id='password']")
    WebElement passwordBoxElement; //
    @FindBy (xpath = "// input [ @ id='login-button']")
    WebElement loginButtonElement;
    @FindBy (xpath = "//select [ @ class='product_sort_container']")
    WebElement dropDownBoxElement;
    @FindBy (id = "inventory_container")
    WebElement clickElement;
    @FindBy (xpath = "//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
    WebElement addToCardElement;
    @FindBy (xpath = "// a [ @ class='shopping_cart_link fa-layers fa-fw']")
    WebElement cartButtonElement;
    @FindBy (xpath = "// div [@ class='subheader']")
    WebElement cartPageElement;
    @FindBy (xpath = "// a [ @ class='btn_action checkout_button']")
    WebElement checkoutButtonElement;
    @FindBy (xpath = "// input [ @ class='btn_primary cart_button']")
    WebElement continueButtonElement;
    @FindBy (xpath = "//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_info_container']/div[1]/form[1]/h3[1]")
    WebElement errorMessageElement;

    public void login (String userName, String password){

        userNameBoxElement.sendKeys(userName);
        passwordBoxElement.sendKeys(password, Keys.ENTER);
    }


public void enterUserName(){

    userNameBoxElement.sendKeys("standard_user");
}

public void enterPassword(){

    passwordBoxElement.sendKeys("secret_sauce");
}

public void clickLoginButton(){

    loginButtonElement.click();
}

    public void verifyPageTitle(String string) {
        String actualTitle =  Driver.get().getTitle();
        System.out.println("Actual: " + actualTitle);
        String expectedTitle = string;
        System.out.println("Expected: " + expectedTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void clickDropDownBox(){
    dropDownBoxElement.click();
       // Utiliies.wait(1);
    }

    public void selectPriceLowToHigh(){
        Select select = new Select(dropDownBoxElement);
        select.selectByVisibleText("Price (low to high)");
        clickElement.click();
       // Utiliies.wait(2);
    }

    public void clickAddToCartButton(){
        addToCardElement.click();
    }

    public void clickCartButton(){
        cartButtonElement.click();
      //  Utiliies.wait(2);
    }

    public void verifyCartPage(){
        String actualText = cartPageElement.getText();
        String expectedText = "Your Cart";
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
    }

    public void clickCheckoutButton(){
        checkoutButtonElement.click();
    }

    public void clickContinueButton(){
        continueButtonElement.click();
    }

    public void errorMessage(String string){
        String actualText = errorMessageElement.getText();
        String expectedText = string;
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Expected Text: " + expectedText);
        System.out.println("Actual Text: " + actualText);

    }



}
