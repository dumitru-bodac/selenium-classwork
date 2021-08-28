package org.itstep.homework.steps;

import cucumber.api.java.en.When;
import org.itstep.homework.actions.CommonActions;
import org.itstep.homework.browser.Driver;
import org.itstep.homework.pages.HirokuAppHomePage;

public class WhenSteps {

    HirokuAppHomePage hirokuAppHomePage = new HirokuAppHomePage(Driver.getDriver());
    CommonActions commonActions = new CommonActions();

    @When("user click on {string} link")
    public void clickOnLink(String linkName){
        commonActions.scrollToElement(hirokuAppHomePage.getElementFromListByName(linkName));
        hirokuAppHomePage.getElementFromListByName(linkName).click();
    }
}
