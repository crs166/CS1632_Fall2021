import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	// TODO: Fill in!
	private Value v; 
	
	@Given("a Value")
	public void aValue(){
		v = new Value();
	}
	
	@When("I call incVal {int} time(s)")
	public void callIncValTimes(Integer times) {
		for(int i=0; i<times; i++)
			v.incVal();
	}
	
	@Then("getVal returns {int}")
	public void getValReturns(Integer retVal) {
		assertEquals("getVal returned the incorrect value", (int)retVal, v.getVal());
	}
}
