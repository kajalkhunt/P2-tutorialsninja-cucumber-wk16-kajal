package com.tutorialsninja.steps;

import com.tutorialsninja.pages.Desktops;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import sun.security.krb5.internal.crypto.Des;

import java.util.ArrayList;
import java.util.Collections;

public class DesktopSteps {
    @And("^I select sortby descending position \"([^\"]*)\"$")
    public void iSelectSortbyDescendingPosition(String ZtoA)  {
       // new Desktops().selectSortByOption("Name (Z - A)");
    }

    @Then("^verify the Product will arrange in Descending order$")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        ArrayList<String> originalProductsName = new Desktops().getProductsNameList();
        // Sort By Reverse order

        Collections.reverse(originalProductsName);

        // Select sort by Name Z - A
       new Desktops().selectSortByOption("Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        ArrayList<String> afterSortByZToAProductsName = new Desktops().getProductsNameList();

        Assert.assertEquals("Product not sorted into Z to A order",afterSortByZToAProductsName,originalProductsName );

    }

    @And("^I select sortby ascending position \"([^\"]*)\"$")
    public void iSelectSortbyAscendingPosition(String AtoZ) {
        new Desktops().aToZAlphabeticalOrder();

    }

    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String HPlaptop)  {

    }

    @And("^Verify the HP Text \"([^\"]*)\"$")
    public void verifyTheHPText(String HPLaptoptext)  {
    Assert.assertEquals(HPLaptoptext,new Desktops().verifyHPL3065Text());
    }

    @And("^I Select Delivery Date \"([^\"]*)\"$")
    public void iSelectDeliveryDate(String deleiveryDate)  {
    new Desktops().deliveryDate();
    }

    @And("^I Enter Qty \"([^\"]*)\" using Select class$")
    public void iEnterQtyUsingSelectClass(String qty)  {
    new Desktops().enterQuantity("1");
    }

    @And("^I Click on Add to Cart button$")
    public void iClickOnAddToCartButton() {
        new Desktops().clickOnAddToCart();
    }

    @And("^Verify the Message \"([^\"]*)\"$")
    public void verifyTheMessage(String message) throws InterruptedException {
        Thread.sleep(3000);
    Assert.assertTrue(new Desktops().getProductAddedSuccessMessage().contains(message));
    }

    @And("^I Click on link shopping cart display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new Desktops().clickOnShoppingCart();
    }

    @And("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String shoppingCart)  {
        Assert.assertTrue(new ShoppingCartPage().getShoppingCartText().contains(shoppingCart));

    }

    @And("^Verify the Product name \"([^\"]*)\"$")
    public void verifyTheProductName(String productName)  {
        Assert.assertTrue(new ShoppingCartPage().getProductName().contains(productName));

    }

    @And("^Verify the Delivery Date \"([^\"]*)\"$")
    public void verifyTheDeliveryDate(String checkDDate)  {
    Assert.assertTrue(new ShoppingCartPage().getDeliveryDate().contains(checkDDate));
    }

    @And("^Verify the Model \"([^\"]*)\"$")
    public void verifyTheModel(String model)  {
    Assert.assertTrue(new ShoppingCartPage().getModel().contains(model));
    }

    @Then("^Verify the Todat \"([^\"]*)\"$")
    public void verifyTheTodat(String total)  {
        new Desktops().currencyConverter();
    Assert.assertTrue(new ShoppingCartPage().getTotal().contains(total));
    }



}
