package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.MainPage;
import pages.SearchResultPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchProduct {

    @Given("^I open main page$")
    public void iOpenMainPage() throws Throwable {
        MainPage.open();
    }

    @And("^I close pop-up window$")
    public void iClosePopUpWindow() throws Throwable {
        MainPage.closePopUpWindow();
    }


    @And("^I enter a product name (.*) in search field$")
    public void iEnterAProductNameSelenideInSearchField(String string) throws Throwable {
        MainPage.enterInSearchField(string);
    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        MainPage.clickSearchSubmitBtn();
    }

    @Then("^the first one should contain text in title (.*)$")
    public void theFirstOneShouldContainProductName(String expectedText) throws Throwable {
        $(".history-item.product").shouldHave(text(expectedText));
    }

}