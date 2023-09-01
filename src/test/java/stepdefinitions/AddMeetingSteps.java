package stepdefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddMeetingPage;

public class AddMeetingSteps {
private AddMeetingPage addMeetingpage=new AddMeetingPage();
	
	@Given ("the user is on the add meeting page")
	public void navigateToclientPage() {
		addMeetingpage.navigateTo();
	}
		
    @When ("the user enter the meeting details and click on the add meeting button")
    public void enterClientDetails() {
    	addMeetingpage.enterMeetingdetails();
    }
      
    @Then ("the Meeting added successfully message should be on output page")
    public void addedClientSuccessfully() {
    	assertEquals("Client added successfully",addMeetingpage.isMeetingAdded());
    }

}
