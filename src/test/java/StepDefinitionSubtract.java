import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitionSubtract {

    @When("I press Subtract")
    public void iPressSubtract() {
        CalculatorController controller = new CalculatorController();
        StepDefinition.result = controller.subtract(StepDefinition.numbers.get(0), StepDefinition.numbers.get(1));
    }

}

