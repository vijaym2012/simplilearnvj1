package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditMeetingPage;

public class EditMeetingSteps {
private EditMeetingPage editMeetingpage=new EditMeetingPage();

	@Given ("the user is on the view meeting page")
	public void navigateToeViewClientPage() {
		editMeetingpage.navigateTo();
	}
  
	@And ("the user click on edit button and open the edit meeting page")
	public void navigateToEditClientPage() {
		editMeetingpage.navigatesTo();
	}
		
    @When ("the user enter the meeting details and click on the update meeting button")
    public void enterClientDetails() {
    	editMeetingpage.enterMeetingdetails();
    }
      
    @Then ("the Meeting updated successfully message should be on output page")
    public void addedClientSuccessfully() {
    	assertEquals("Meeting updated successfully",editMeetingpage.ismeetingUpdated());
    }

}

