package steps;

import baseCode.libary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObModel.pageLeadGeneration;

public class pageLeadGenerationTestCase extends libary {
	pageLeadGeneration leadGen;
	
	@Given("the user click the popup")
	public void theUserClickThePopup() {
		leadGen = new pageLeadGeneration(driver);
		leadGen.clickPopupLeadGen();	    
	}
	@When("the user click the button register form")
	public void theUserClickTheButtonRegisterForm() {
		leadGen.clickRegisterForm();
	}
	@Then("the user click consent check box 1")
	public void theUserClickConsentCheckBox1() {
	    leadGen.clickConsentCheckbox1();	    
	}
	@Then("the user click dropdown in the pdf 1")
	public void theUserClickDropdownInThePdf1() {
	    leadGen.clickDropdownInPDF1();	    
	}
	@Then("the user click the button in the pdf 1")
	public void theUserClickTheButtonInThePdf1() {
	    leadGen.clickButtonInPDF1();	    
	}
	@Then("the user click check box link")
	public void theUserClickCheckBoxLink() {
	    leadGen.clickCheckboxLink();	    
	}
	
	@Then("the user click consent check box 2")
	public void theUserClickConsentChecBbox2() {
	    leadGen.clickConsentCheckbox2();	    
	}
		
	@Then("the user click button submit 2")
	public void theUserClickButtonSubmit2() {
	   	leadGen.clickButtonSubmit2();  
	}
	
	@Then("the user click consent check box 3")
	public void theUserClickConsentChecBbox3() {
	    leadGen.clickConsentCheckbox3();	    
	}
			
	@Then("the user click button submit 3")
	public void theUserClickButtonSubmit3() {
	    leadGen.clickButtonSubmit3();	    
	}
	
	@Then("the user click consent check box 4")
	public void theUserClickConsentChecBbox4() {
	    leadGen.clickConsentCheckbox4();	    
	}
		
	@Then("the user click button submit 4")
	public void theUserClickButtonSubmit4() {
	    leadGen.clickButtonSubmit4();	    
	}
		
//	@Then("the user click consent check box 5")
//	public void theUserClickConsentChecBbox5() {
//	    leadGen.clickConsentCheckbox5();	    
//	}
	
	@Then("the user click consent check box 6")
	public void theUserClickConsentChecBbox6() {
	    leadGen.clickConsentCheckbox6();	    
	}
		
	@Then("the user click button submit page")
	public void theUserClickButtonSubmitPage() {
	    leadGen.clickButtonSumitPage();	    
	}
	@Given("the user click the button register")
	public void theUserClickTheButtonRegister() {
	    leadGen.clickButtonRegister();	    
	}
}
