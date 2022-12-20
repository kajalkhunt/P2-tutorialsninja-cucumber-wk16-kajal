package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I mouse hover to desktop tab$")
    public void iMouseHoverToDesktopTab() {
      }


    @And("^I click on show all desktops$")
    public void iClickOnShowAllDesktop() {
        new HomePage().showAllDesktop();
    }

    @Then("^verify desktop text message$")
    public void verifyDesktopTextMessage() {
        Assert.assertEquals("Desktops",new HomePage().verifyDesktopText());
    }

    @And("^I mouse hover to laptop and desktop tab$")
    public void iMouseHoverToLaptopAndDesktopTab() {
    }

    @And("^I click on show all laptop and notebooks$")
    public void iClickOnShowAllLaptopAndNotebooks() {
        new HomePage().showAllLaptopAndNotebook();
    }

    @Then("^verify laptop and notebooks text$")
    public void verifyLaptopAndNotebooksText() {
        Assert.assertEquals("Laptops & Notebooks",new HomePage().verifyLaptopAndNotebookText());
    }

    @And("^I mouse hover to component tab$")
    public void iMouseHoverToComponentTab() {
    }

    @And("^I click on show all components$")
    public void iClickOnShowAllComponents() {
        new HomePage().showAllComponents();
    }

    @Then("^verify components text$")
    public void verifyComponentsText() {
        Assert.assertEquals("Components",new HomePage().verifyComponentsText());
    }
}
