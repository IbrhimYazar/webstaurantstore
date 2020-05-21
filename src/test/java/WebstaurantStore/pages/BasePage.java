package WebstaurantStore.pages;

import WebstaurantStore.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

        public BasePage() {
            PageFactory.initElements(Driver.get(), this);
        }

        public void Wait(int second){
            try{
                Thread.sleep(second);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
