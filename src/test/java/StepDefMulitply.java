import io.cucumber.java.en.When;

public class StepDefMulitply {
    @When("I click Multiply")
    public void iClickMultiply() {
        CalculatorController controller = new CalculatorController();
        StepDefinition.result = controller.multiply(StepDefinition.numbers.get(0), StepDefinition.numbers.get(1));
    }
}
