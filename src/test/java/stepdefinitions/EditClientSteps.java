package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditClientPage;

public class EditClientSteps {
private EditClientPage editClientpage=new EditClientPage();
	
	@Given ("the user is on the view client page")
	public void navigateToeViewClientPage() {
		editClientpage.navigateTo();
	}
  
	@And ("the user click on edit button and open the edit client page")
	public void navigateToEditClientPage() {
		editClientpage.navigatesTo();
	}
		
    @When ("the user enter the client details and click on the update client button")
    public void enterClientDetails() {
    	editClientpage.enterClientdetails();
    }
      
    @Then ("the Client updated successfully message should be on output page")
    public void addedClientSuccessfully() {
    	assertEquals("Client updated successfully",editClientpage.isclientUpdated());
    }

}