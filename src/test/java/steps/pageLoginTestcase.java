package steps;

import baseCode.libary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObModel.pageLogin;

public class pageLoginTestcase extends libary {
	pageLogin pageLoginApp;

	@Given("enter the phone number")
	public void enterThePhoneNumber() {
		pageLoginApp = new pageLogin(driver);
		pageLoginApp.sendPhoneLogin("0708275644");
	}

	@Given("select the checkbox to agree to the terms")
	public void selectTheCheckboxToAgreeToTheTerms() {
		pageLoginApp.checkBox();
	}

	@When("click the {string} button")
	public void clickTheButton(String string) {
		pageLoginApp.buttonLogin();
	}

	@Then("The system proceeds to the second-level password step")
	public void theSystemProceedsToTheSecondLevelPasswordStep() {
		pageLoginApp.enterPin("111111");
	}
}
