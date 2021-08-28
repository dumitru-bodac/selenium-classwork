package org.itstep.homework.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.itstep.homework.browser.Driver;

public class BeforeAfterSteps {


    @Before
    public void beforeStep(){
        Driver.runDriver();
        System.out.println("run Driver");
        System.out.println("");

    }

    @After
    public void afterStep(){
        Driver.quitDriver();
    }
}
