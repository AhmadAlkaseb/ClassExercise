import io.cucumber.java.en.When;

public class StepdefModulu {

    @When("I press Modulus")
    public void pressModulus() {
        CalculatorController controller = new CalculatorController();
        StepDefinition.result = controller.modulus(StepDefinition.numbers);
    }
}
