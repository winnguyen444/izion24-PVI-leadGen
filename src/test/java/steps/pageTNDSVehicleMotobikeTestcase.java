package steps;

import java.io.IOException;
import baseCode.libary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObModel.pageTNDSVehicleMotobike;

public class pageTNDSVehicleMotobikeTestcase extends libary {
	pageTNDSVehicleMotobike motobike;
	
	
	@Given("the user click close the popup")
	public void theUserClickCloseThePopup() {
		motobike = new pageTNDSVehicleMotobike(driver);
		motobike.clickClosePopup();
	}

	@Given("the user clicks See more in the insurance category section")
	public void theUserClicksInTheInsuranceCategorySection() {		
		motobike.clickSeeMore();
	}

	@When("the user selects the product")
	public void theUserSelectsTheProduct() {
		motobike.ActionscrollToDescAndClick();
	}

	@When("the user selects the vehicle type 50cc or larger")
	public void theUserSelectsTheVehicleType() {
		motobike.click50ccAndBove();
	}

	@Then("the user clicks Update")
	public void theUserClicks() {
		motobike.clickUpdate();
	}

	@Given("The user selects the product base")
	public void Theuserselectstheproductbase() {
		motobike.clickproductElement();
	}

	@Given("The user selects the product card with premiums starting from 66 VND")
	public void theUserSelectsTheProductCardForWithPremiumsStartingFromVND() {
		motobike.clickpacked1year();
	}

	@When("The user click check box")
	public void TheUserClickCheckBox() {
		motobike.clickCheckBox2000();
	}
	
	@When("The user enters name")
	public void theUserEntersAsThe() {
		motobike.inputFullName();
	}

	@When("The user enters license plate number")
	public void theUserEntersAsTheVehicleIdentificationNumber() {
		motobike.inputFullLicensePlateNumber();
	}

	@Given("The user enters the vin")
	public void theUserSelects() {
		motobike.inpuFullVin();
	}

	@Given("The user hover click screen")
	public void TheUserHoverClickScreen() {
		motobike.clickScreen();
	}

	@Given("the user clicks Continue")
	public void theUserClicksContinue() {
		motobike.clickContinute();
	}

	@When("The user selects checkbox")
	public void TheUserSelectsCheckbox() {
		motobike.clickCheckBox();
	}

	@When("the user clicks box number 1 the link")
	public void theUserClicksBoxNumber1TheLink() {
		motobike.clickCheckBox1Link();
	}

	@When("The user clicks the down arrow to scroll 1")
	public void theUserClicksTheDownArrowToScroll1() {
		motobike.clickArrow1();
	}

	@When("the user clicks submit 1")
	public void theUserClicksSubmit1() throws InterruptedException {
		motobike.clickButtonSubmit1();
	}

	@When("The user checks box number 2 the link")
	public void TheUserChecksBoxNumber2TheLink() {
		motobike.clickCheckbox2();
	}

	@When("The user clicks the down arrow to scroll 2")
	public void theUserClicksTheDownArrowToScroll2() {
		motobike.clickArrowcheckbox2();
	}

	@When("the user clicks submit 2")
	public void theUserClicksSubmit2() {
		motobike.clickButtonSubmit2();
	}

	@When("the user click payment")
	public void theUserClickPayment() {
		motobike.clickPayment();
	}

	@Given("the user chooses to use a payment code")
	public void theUserChoosesToUseAPaymentCode() {
		motobike.ClickPaymentCash();	
	}
	
	// ================get api process bill==========================
	@When("Login Get Token For Payoo")
	public void LoginGetTokenForPayoo() throws IOException {
		motobike.login();		
	}
	
	@When("Cash Payment Confirm")
	public void CashPaymenConfirm() throws IOException {
		motobike.getBillAndConfirm();
	}

}
