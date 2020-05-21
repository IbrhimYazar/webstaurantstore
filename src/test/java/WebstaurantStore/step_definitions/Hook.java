package WebstaurantStore.step_definitions;

import WebstaurantStore.utilities.ConfigurationReader;
import WebstaurantStore.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setup(){
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){

        if(scenario.isFailed()){
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }else {
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        Driver.get().quit();

    }


}
