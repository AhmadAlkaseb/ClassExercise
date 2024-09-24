import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitionAddition {
    ArrayList<Integer> numbersToBeAddedTogether = new ArrayList<>();
    int result = 0;

    @Given("I have the number {int}")
    public void iHaveTheNumber(int arg0) {
        numbersToBeAddedTogether.add(arg0);
    }

    @When("I press Add")
    public void iPressAdd() {
        CalculatorController controller = new CalculatorController();
        result = controller.add(numbersToBeAddedTogether.get(0), numbersToBeAddedTogether.get(1));
    }

    @Then("I want to see the result {int} in my display.")
    public void iWantToSeeTheResultInMyDisplay(int arg0) {
        assertEquals(arg0, result);
    }
}
