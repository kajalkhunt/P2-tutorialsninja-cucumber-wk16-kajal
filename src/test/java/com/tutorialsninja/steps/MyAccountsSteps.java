package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MyAccountsSteps {
    @And("^I Click on My Account link$")
    public void iClickOnMyAccountLink() {
       new MyAccountPage().clickOnMyAccounts();
    }

    @And("^I call method 'SelectMyAccountOptions' and pass the parameter \"([^\"]*)\"$")
    public void iCallMethodSelectMyAccountOptionsAndPassTheParameter(String register) {
    new MyAccountPage().selectMyAccountOptions(register);

    }

    @Then("^Verify the register text \"([^\"]*)\"$")
    public void verifyTheRegisterText(String registerAccount) {
        Assert.assertTrue(new MyAccountPage().getRegisterText().contains(registerAccount));
    }

    @And("^I call method 'SelectMyAccountOptions' and pass the parameter as \"([^\"]*)\"$")
    public void iCallMethodSelectMyAccountOptionsAndPassTheParameterAs(String login) {
        new MyAccountPage().selectMyAccountOptions(login);
    }

    @Then("^Verify the returning text \"([^\"]*)\"$")
    public void verifyTheReturningText(String returningCustomer) {
        Assert.assertTrue(new MyAccountPage().getReturningCustomerText().contains(returningCustomer));
    }

    @And("^I Enter First Name$")
    public void iEnterFirstName() {
    new MyAccountPage().fieldRegisterAccountDetails();
    }

    @And("^I Enter Last Name$")
    public void iEnterLastName() {

    }

    @And("^I Enter Email$")
    public void iEnterEmail() {
    }

    @And("^I Enter Telephone$")
    public void iEnterTelephone() {
    }

    @And("^I Enter Password$")
    public void iEnterPassword() {
    }

    @And("^I Enter Password Confirm$")
    public void iEnterPasswordConfirm() {
    }

    @And("^I Select Subscribe Yes radio button$")
    public void iSelectSubscribeYesRadioButton() {
    new MyAccountPage().clickOnRadioButton();
    }

    @And("^I Click on Privacy Policy check box$")
    public void iClickOnPrivacyPolicyCheckBox() {
        new MyAccountPage().clickOnAgree();
    }

   /* @And("^I Click on Continue button$")
    public void iClickOnContinueButton() {
        new MyAccountPage().clickOnContinue();
    }*/

    @And("^I Verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String message) {
        Assert.assertTrue(new MyAccountPage().getAccountText().contains(message));
    }

    @And("^I Call the method 'selectMyAccountOptions' method and pass the parameter \"([^\"]*)\"$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String logOut) {

        new MyAccountPage().selectMyAccountOptions(logOut);
    }

    @And("^Verify the account logout text \"([^\"]*)\"$")
    public void verifyTheAccountLogoutText(String accLogOut) {
    Assert.assertTrue(new MyAccountPage().getAccountLogoutText().contains(accLogOut));
    }

    @And("^I Enter Email address$")
    public void iEnterEmailAddress() {
    new MyAccountPage().sendEmailPasswordDetails();
    }

    @And("^I Click on Login button$")
    public void iClickOnLoginButton() {
    new MyAccountPage().clickOnSubmit();
    }

    @And("^Verify text \"([^\"]*)\"$")
    public void verifyText(String myAccount) {
   Assert.assertTrue(new MyAccountPage().getTextFromMyAccounts().contains(myAccount));
    }

    @And("^I Click on after privacy Continue button$")
    public void iClickOnAfterPrivacyContinueButton() {
    new MyAccountPage().clickOnContinue();
    }

    @And("^I Click on after message Continue button$")
    public void iClickOnAfterMessageContinueButton() {
    new MyAccountPage().clickOnCont();
    }

    @Then("^I Click on after logout Continue button$")
    public void iClickOnAfterLogoutContinueButton() {
    new MyAccountPage().clickOnCont();
    }


}
