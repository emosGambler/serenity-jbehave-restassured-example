package serenity.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.is;

public class MainSteps {

    private Response response;

    @Given("a system state")
    public void givenASystemState() {
    }

    @When("I do endpoint $endpoint")
    public void whenIDoSomething(String endpoint) {
        response = RestAssured.
                when().get("http://localhost:3000/" + endpoint);
    }

    @Then("status code is $statusCode")
    public void thenSystemIsInADifferentState(int statusCode) {
        assertEquals(response.getStatusCode(), 200);
    }
}
