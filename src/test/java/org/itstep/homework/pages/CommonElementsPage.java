package org.itstep.homework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElementsPage {

    private WebDriver driver;

    @FindBy(xpath = "//h3")
    private WebElement pageTitle;


    public CommonElementsPage(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }

    public WebElement getPageTitle(){
        return pageTitle;
    }


}
