package com.tutorialsninja.steps;

import com.tutorialsninja.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.tutorialsninja.utility.Utility.getAlphaNumericString;

public class LaptopsAndNotebooksSteps {
    @And("^I select Sort By \"([^\"]*)\"$")
    public void iSelectSortBy(String HToL)  {
      new LaptopsAndNoteBooks().selectSortByOption(HToL);
    }

    @Then("^Verify the Product price will arrange in High to Low order$")
    public void verifyTheProductPriceWillArrangeInHighToLowOrder() {
        List<Double> originalProductsPrice =  new LaptopsAndNoteBooks().getProductsPriceList();
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        // Select sort by Price (High > Low)
        new LaptopsAndNoteBooks().selectSortByOption("Price (High > Low)");
        ArrayList<Double> afterSortByPrice = new LaptopsAndNoteBooks().getProductsPriceList();
        Assert.assertEquals(originalProductsPrice,afterSortByPrice);
    }

    @And("^Select Product \"([^\"]*)\"$")
    public void selectProduct(String selProduct)  {
        new LaptopsAndNoteBooks().selectProductByName(selProduct);

    }

    @And("^I Click on ‘Add To Cart’ button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String VerMessage)  {
        Assert.assertTrue(new ProductPage().getProductAddedSuccessMessage().contains(VerMessage));

    }

    @And("^I Click on link “shopping cart” display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @And("^Verify the text after adding \"([^\"]*)\"$")
    public void verifyTheTextAfterAdding(String aftMessage)  {
    Assert.assertTrue(new ShoppingCartPage().getShoppingCartText().contains(aftMessage));
    }

    @And("^Verify the Product name after adding \"([^\"]*)\"$")
    public void verifyTheProductNameAfterAdding(String aftName)  {
    Assert.assertTrue(new ShoppingCartPage().getProductName().contains(aftName));
    }

    @And("^I Change Quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty)  {
        new LaptopsAndNoteBooks().sendTextToElement();
    }

    @And("^I Click on “Update” Tab$")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @And("^Verify the Total \"([^\"]*)\"$")
    public void verifyTheTotal(String total)  {
        new Desktops().currencyConverter();
    Assert.assertTrue(new ShoppingCartPage().getTotal().contains(total));
    }

    @And("^I Click on “Checkout” button$")
    public void iClickOnCheckoutButton() {
    new LaptopsAndNoteBooks().clickOnCheckoutButton();
    }

    @And("^Verify the Text \"([^\"]*)\"$")
    public void verifyTheText(String verify)  {
       }

    @And("^I Click on Guest Checkout radio button$")
    public void iClickOnGuestCheckoutRadioButton() throws InterruptedException {
        Thread.sleep(3000);
      new LaptopsAndNoteBooks().clickOnRadioButton();
    }

    @And("^I Click on Continue tab$")
    public void iClickOnContinueTab() throws InterruptedException {
      //  Thread.sleep(3000);
     //   new LaptopsAndNoteBooks().clickOnContinueButton();
    }

    @And("^I Fill the mandatory fields$")
    public void iFillTheMandatoryFields() {
        new LaptopsAndNoteBooks().addingMandatoryFields("Enter First Name", "Raghav", By.id("input-payment-firstname"));
        new LaptopsAndNoteBooks().addingMandatoryFields("Enter Last Name", "Raja", By.id("input-payment-lastname"));
        new LaptopsAndNoteBooks().addingMandatoryFields("Enter Email", "RaghavRaja@gmail.com", By.id("input-payment-email"));
        new LaptopsAndNoteBooks().addingMandatoryFields("Enter Telephone", "02089056066", By.id("input-payment-telephone"));
        new LaptopsAndNoteBooks().addingMandatoryFields("Enter Address1", "95 Harrow Road", By.id("input-payment-address-1"));
        new LaptopsAndNoteBooks().addingMandatoryFields("Enter City", "London", By.id("input-payment-city"));
        new LaptopsAndNoteBooks().addingMandatoryFields("Enter Postcode", "HA8 9ZZ", By.id("input-payment-postcode"));
        new LaptopsAndNoteBooks().selectCountry();
        new LaptopsAndNoteBooks().selectState();
        //new LaptopsAndNoteBooks().addingMandatoryFields();
    }

    @And("^I Click on Continue Button$")
    public void iClickOnContinueButton() throws InterruptedException {
        Thread.sleep(2000);
        new AccountRegisterPage().clickOnContinueButton();
    }

    @And("^I Add Comments About your order into text area$")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new LaptopsAndNoteBooks().addComment();
    }

    @And("^I Check the Terms & Conditions check box$")
    public void iCheckTheTermsConditionsCheckBox() throws InterruptedException {

        new LaptopsAndNoteBooks().checkBoxClick();
    }

    @And("^I Click on Continue button again$")
    public void iClickOnContinueButtonAgain() throws InterruptedException {
        Thread.sleep(2000);
        new LaptopsAndNoteBooks().clickOnLastContinueButton();
    }

    @And("^Verify the lastMessage \"([^\"]*)\"$")
    public void verifyTheLastMessage(String lastMessage)  {

    }
}
