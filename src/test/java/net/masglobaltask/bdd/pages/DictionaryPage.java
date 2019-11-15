package net.masglobaltask.bdd.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("http://www.google.com")
public class DictionaryPage extends PageObject {

    @FindBy(name="q")
    private WebElementFacade lblSearchInput;

    @FindBy(name="btnK")
    private WebElementFacade btnSearch;

    @FindBy(css="title")
    private WebElementFacade lblHtmlTitle;

   // @FindBy(xpath="//li[@class='sbct']")
    @FindBy(css="li.sbct")
    private List<WebElementFacade> lSearchListResult;

    @FindBy(css="ul.erkvQe > li")
   // @FindBy(xpath="//ul[@class='erkvQe']/li")
    private List<WebElementFacade> lSuggestionListResult;


    public void enterKeywords(String keyword) {
        lblSearchInput.click();
        lblSearchInput.sendKeys(keyword);
    }

    public void clickSearchButton() {
        btnSearch.click();
    }

    public boolean validateLink(String arg1) throws InterruptedException {
       return this.getDriver().findElements(By.xpath("//*[contains(text(),'"+ arg1 +"')]")).get(0).isDisplayed();
    }

    public void clickLinkSearch(String arg1) {
        this.getDriver().findElement(By.xpath("//h3/span[contains(text(),'"+arg1+"')]")).click();
    }

    public boolean validateSuggestionList() {

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.sbct")));
        int lsize = 0;
        lsize = lSearchListResult.size();
        if (lsize > 0)
            return true;
        else
            return false;
    }

    public void clickFirstElement() {
        lSearchListResult.get(0).click();
    }

    public String getHtmlTitle() {

        System.out.println("TITLE:"+getDriver().getTitle()+":");
        return getDriver().getTitle();
    }
}