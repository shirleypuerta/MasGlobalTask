package net.masglobaltask.bdd.steps.serenity;

import net.masglobaltask.bdd.pages.DictionaryPage;
import org.fluentlenium.core.annotation.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {
    @Page
    DictionaryPage dictionaryPage;

    public void goto_homepage() {
        dictionaryPage.open();

    }

    public void sendSearchValue(String searchValue) {
        dictionaryPage.enterKeywords(searchValue);

    }

    public void clickSearchButton() {
        dictionaryPage.clickSearchButton();
    }

    public boolean validateLink(String arg1) throws InterruptedException {
        return dictionaryPage.validateLink(arg1);
    }

    public void clickLinkSearch(String arg1) {
        dictionaryPage.clickLinkSearch(arg1);
    }

    public boolean validateSuggestionList() {
        return dictionaryPage.validateSuggestionList();
    }

    public void clickFirstElement() {
        dictionaryPage.clickFirstElement();
    }

    public String getHtmlPageTitle() {
        return dictionaryPage.getHtmlTitle();
    }
}