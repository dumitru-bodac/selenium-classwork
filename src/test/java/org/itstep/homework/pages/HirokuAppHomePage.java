package org.itstep.homework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HirokuAppHomePage {

    private WebDriver driver;

    @FindBy(xpath = "//ul")
    private WebElement linkList;


    public HirokuAppHomePage(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver1,this);
    }


    public List<WebElement> getListElements(){
        return linkList.findElements(By.tagName("a"));
    }


    public WebElement getElementFromListByName(String elementName){

        return getListElements().stream()
                .filter(element -> element.findElement(By.className("item-title"))
                        .getText().equals(elementName))
                .findFirst()
                .orElseThrow(()-> new
                        RuntimeException("Such menu item does not exists - " + elementName));

    }

}
