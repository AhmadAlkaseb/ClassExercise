import io.cucumber.java.en.When;


public class StepDefinitionSubtract {

    @When("I press Subtract")
    public void iPressSubtract() {
        CalculatorController controller = new CalculatorController();
        StepDefinition.result = controller.subtract(StepDefinition.numbers);
    }

}

