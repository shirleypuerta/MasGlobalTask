package net.masglobaltask.bdd.steps;

import jxl.common.Assert;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.masglobaltask.bdd.steps.serenity.EndUserSteps;
import org.hamcrest.MatcherAssert;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;

    @Given("^Im on the homepage$")
    public void im_on_the_homepage() {
        endUserSteps.goto_homepage();
    }

    @When("^I type \"([^\"]*)\" into the search field$")
    public void i_type_into_the_search_field(String arg1) {
        endUserSteps.sendSearchValue(arg1);
    }

    @When("^I click the Google Search button and I go to the search results page$")
    public void i_click_the_Google_Search_button() {
        endUserSteps.clickSearchButton();
    }

    @Then("^the first result is \"([^\"]*)\"$")
    public void the_first_result_is(String arg1) throws InterruptedException {
        MatcherAssert.assertThat("The search link is not present", endUserSteps.validateLink(arg1));
    }

    @When("^I click on the first result link and I go to the search results page$")
    public void i_click_on_the_first_result_link() { endUserSteps.clickFirstElement(); }

    @When("^I click on the first result link$")
    public void i_click_on_the_first_resultlink() { endUserSteps.clickFirstElement(); }

    @When("^I click on the first result link \"([^\"]*)\"$")
    public void i_click_on_the_first_result_link(String arg1) {
        endUserSteps.clickLinkSearch(arg1);
    }

    @When("^the suggestions list is displayed$")
    public void the_suggestions_list_is_displayed() { MatcherAssert.assertThat("The suggestion list is not present", endUserSteps.validateSuggestionList()); }

    @When("^I click on the first suggestion in the list$")
    public void i_click_on_the_first_suggestion_in_the_list() {
        endUserSteps.clickFirstElement();
    }

    @Then("^I go to the \"([^\"]*)\" page$")
    public void i_go_to_the_page(String arg1) {
        Assert.verify(endUserSteps.getHtmlPageTitle().equalsIgnoreCase(arg1), "This is not the page");
    }

}
