package WebstaurantStore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSwagLabs extends BasePage{

    @FindBy (xpath = "// input [ @ id=\"user-name\"]")
    WebElement userNameBox;
    @FindBy (xpath = "// input [ @ id='password']")
    WebElement passwordBox;
    @FindBy (xpath = "// input [ @ id='login-button']")
    WebElement loginButton;

public void enterUserName(){

    userNameBox.sendKeys("standard_user");
}

public void enterPassword(){

    passwordBox.sendKeys("secret_sauce");
}

public void clickLoginButton(){

    loginButton.click();
}

public void validateLoginPage(){

}


}
