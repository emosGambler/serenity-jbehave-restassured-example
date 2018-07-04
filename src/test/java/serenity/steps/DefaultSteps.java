package serenity.steps;
import com.google.common.collect.Lists;
import net.serenitybdd.core.Serenity;
import org.jbehave.core.annotations.*;
import net.thucydides.core.annotations.Steps;


import static net.serenitybdd.rest.SerenityRest.rest;
import static org.hamcrest.Matchers.equalTo;

public class DefaultSteps {
    /*@Steps
    EndUserSteps endUser;*/

    @Given("a system state")
    public void givenDescription(String description) {

    }

    @When("I do something")
    public void whenSomething(String something) {

    }

    @Then("system is in a different state")
    public void thenStep3() {

    }
}
