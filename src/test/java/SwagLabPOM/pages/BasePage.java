package SwagLabPOM.pages;

import SwagLabPOM.utilities.Driver;
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
