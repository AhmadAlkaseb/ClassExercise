import io.cucumber.java.en.When;

public class StepdefDivide {
    @When("press Divide")
    public void pressDivide() {
        CalculatorController controller = new CalculatorController();
        StepDefinition.result = controller.divide(StepDefinition.numbers);
    }
}
