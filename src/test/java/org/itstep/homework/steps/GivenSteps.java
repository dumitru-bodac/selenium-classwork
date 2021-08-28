package org.itstep.homework.steps;

import cucumber.api.java.en.Given;
import org.itstep.homework.browser.Driver;

public class GivenSteps {


    @Given("user is at hiroku page")
    public void accessHirokuPage(){
        Driver.getDriver().get("http://the-internet.herokuapp.com/");
    }
}
