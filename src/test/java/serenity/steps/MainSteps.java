package serenity.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertFalse;

public class MainSteps {

    private boolean something;

    @Given("a system state")
    public void givenASystemState() {
        something = true;
    }

    @When("I do something")
    public void whenIDoSomething() {
        something = false;
    }

    @Then("system is in a different state")
    public void thenSystemIsInADifferentState() {
        assertFalse(something);
    }
}
