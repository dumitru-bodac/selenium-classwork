package org.itstep.homework.steps;

import cucumber.api.java.en.Then;
import org.itstep.homework.browser.Driver;
import org.itstep.homework.pages.CommonElementsPage;

public class ThenSteps {


    CommonElementsPage commonElementsPage = new CommonElementsPage(Driver.getDriver());

    @Then("{string} page is displayed")
    public void newPageIsDisplayed(String pageName){
        System.out.println(commonElementsPage.getPageTitle().getText());
    }

}
