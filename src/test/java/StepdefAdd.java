import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepdefAdd {

    ArrayList<Integer> numbersForAddition = new ArrayList<>();
    int result = 0;

    @Given("i have the number {int}")
    public void iHaveTheNumber(int arg0) {
        numbersForAddition.add(arg0);
    }

    @When("press Add")
    public void pressAdd() {
        CalculatorController controller = new CalculatorController();
        result = controller.add(numbersForAddition);
    }

    @Then("i want to see the result {int} in my display")
    public void iWantToSeeTheResultInMyDisplay(int arg0) {
        assertEquals(arg0,result);
    }

    @Given("i have {int}")
    public void iHave(int arg0) {
        numbersForAddition.add(arg0);
    }

    @When("i press Modulus")
    public void pressModulus() {
        CalculatorController controller = new CalculatorController();
        result = controller.modulus(numbersForAddition);
    }
}
