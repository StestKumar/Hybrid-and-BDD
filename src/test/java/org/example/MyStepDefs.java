package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

public class MyStepDefs {
    HomePage homePage = new HomePage();

    RegistrationPage registrationPage = new RegistrationPage();

    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    ElectronicsPage electronicsPage = new ElectronicsPage();

    CellPhonePage cellPhonePage = new CellPhonePage();

    HTCOneM8AndroidL5_0LollipopPage htcOneM8AndroidL5_0LollipopPage = new HTCOneM8AndroidL5_0LollipopPage();

    CartPage cartPage = new CartPage();

    CheckOutPage checkOutPage = new CheckOutPage();

    OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();

    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();

    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();

    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();

    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();

    CompletionPage completionPage = new CompletionPage();

    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new LeicaTMirrorlessDigitalCameraPage();

    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();

    SearchedProductPage searchedProductPage = new SearchedProductPage();

    LastCommentVerification lastCommentVerification = new LastCommentVerification();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage()
    {
    }
    @Given("I click on register button")
    public void i_click_on_register_button()
    {
        homePage.clickOnRegisterButton();
    }
    @When("I enter the registration details")
    public void i_enter_the_registration_details()
    {
        registrationPage.enterRegistrationDetail();
    }

    @Then("I should be registered successfully")
    public void i_should_be_registered_successfully()
    {
        registrationResultPage.compareActualMsgWithExpectedMessage();
    }

    @When("I click on {string} button")
    public void iClickOnButton(String arg0)
    {
    }

    @Then("I should be able to verify that user is navigated to {string} page")
    public void iShouldBeAbleToVerifyThatUserIsNavigatedToPage(String arg0) {
    }

    @Given("I click on HTC_One _M8 _Android _L _{double} _Lollipop")
    public void i_click_on_htc_one__m8__android__l__lollipop(Double double1)
    {
        homePage.clickOnElectronics();

        electronicsPage.clickOnCellPhones();
    }

    @Given("I click on Add to Cart Button")
    public void i_click_on_add_to_cart_button()
    {
        cellPhonePage.clickOnHTCOneM8AndroidL5_0Lollipop();

    }
    @Given("I click on shopping cart")
    public void i_click_on_shopping_cart()
    {
        htcOneM8AndroidL5_0LollipopPage.ClickOnAddToCart();
    }

    @Given("I accept the term of service")
    public void i_accept_the_term_of_service()
    {
        cartPage.acceptTheTermsAndConditions();
    }

    @Given("I click on checkout as guest")
    public void i_click_on_checkout_as_guest()
    {
        checkOutPage.clickOnCheckOutAsGuest();
    }

    @When("I enter the user details")
    public void i_enter_the_user_details()
    {
        onePageCheckoutPage.enterGuestDetails();
    }

    @When("I select delivery method")
    public void i_select_delivery_method()
    {
        shippingMethodPage.selectShippingOption();
    }

    @When("I select credit card")
    public void i_select_credit_card() {
        paymentMethodPage.selectPaymentMethod();
    }

    @When("I enter card details")
    public void i_enter_card_details() {
        paymentInformationPage.providePaymentDetails();
    }

    @When("I confirm the details")
    public void i_confirm_the_details()
    {
        confirmOrderPage.confirmOrder();
    }

    @Then("I should be able to check out as guest")
    public void i_should_be_able_to_check_out_as_guest()
    {
        completionPage.verifyOrderConfirmationMessage();
    }


    @Given("I click on electronics button")
    public void i_click_on_electronics_button() {
        homePage.clickOnElectronics();
    }
    @Given("I click on camera & photo button")
    public void i_click_on_camera_photo_button() {
        electronicsPage.clickOnCameraAndPhoto();
    }
    @Given("I click on Leica T Mirrorless Digital Camera")
    public void i_click_on_leica_t_mirrorless_digital_camera() {
        cameraAndPhotoPage.clickOnLeicaTMirrorlessDigitalCamera();
    }
    @Given("I click on email a friend button")
    public void i_click_on_email_a_friend_button() {
        leicaTMirrorlessDigitalCameraPage.clickOnEmailAFriend();
    }
    @When("I enter friends details")
    public void i_enter_friends_details() {
        emailAFriendPage.enterEmailAFriendDetails();
    }
    @Then("email should be successfully sent")
    public void email_should_be_successfully_sent() {

    }


    @And("I enter the product name in search bar")
    public void iEnterTheProductNameInSearchBar() {
        homePage.clickOnSearchButton("Apple");
    }

    @When("I click on the search submit button")
    public void iClickOnTheSearchSubmitButton() {
        searchedProductPage.productNameVerification("Apple");
    }

    @Then("I should be able to see all the products for the searched name")
    public void iShouldBeAbleToSeeAllTheProductsForWhatIsSearched() {
    }

    @And("I should be able to verify the URL of the page")
    public void iShouldBeAbleToVerifyTheURLOfThePage() {
        searchedProductPage.toVerifyURLOfThePageWithProductSearched("Apple");
    }

    @And("I click on the details button on nopcommerce new release")
    public void iClickOnTheDetailsButtonOnNopcommerceNewRelease() {
        homePage.clickOnDetailsButtonOnNewsNewRelease();
    }

    @And("I enter the title and comment")
    public void iEnterTheTitleAndComment() {

    }

    @When("I click on the new comment submit button")
    public void iClickOnTheNewCommentSubmitButton() {

    }

    @Then("I should be able to verify my comment is last in the list")
    public void iShouldBeAbleToVerifyMyCommentIsLastInTheList() {
        lastCommentVerification.toVerifyThatCommentAddedIsLast(By.xpath("//div[@class='comment-content']"));
    }
}
