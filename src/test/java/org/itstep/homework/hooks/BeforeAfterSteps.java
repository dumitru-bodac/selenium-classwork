package org.itstep.homework.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.itstep.homework.browser.Driver;

public class BeforeAfterSteps {


    @Before
    public void beforeStep(){
        Driver.runDriver();
    }

    @After
    public void afterStep(){
        Driver.quitDriver();
        System.out.println("quit Driver");
        System.out.println("");

    }
}
