import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitionSubtract {

    @When("I press Subtract")
    public void iPressSubtract() {
        CalculatorController controller = new CalculatorController();
        StepDefinitionAddition.result = controller.subtract(StepDefinitionAddition.numbers.get(0), StepDefinitionAddition.numbers.get(1));
    }

}

