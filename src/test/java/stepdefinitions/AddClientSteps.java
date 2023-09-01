package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddClientPage;

public class AddClientSteps {
private AddClientPage addClientpage=new AddClientPage();
	
	@Given ("the user is on the add client page")
	public void navigateToclientPage() {
		addClientpage.navigateTo();
	}
		
    @When ("the user enter the client details and click on the add client button")
    public void enterClientDetails() {
    	addClientpage.enterClientdetails();
    }
      
    @Then ("the Client added successfully message should be on output page")
    public void addedClientSuccessfully() {
    	assertEquals("Client added successfully",addClientpage.isclientAdded());
    }

}
