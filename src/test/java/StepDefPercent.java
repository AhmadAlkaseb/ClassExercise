import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class StepDefPercent {

    @When("I click Calculate Percentage")
    public void iClickCalculatePercentage() {
        CalculatorController controller = new CalculatorController();
        StepDefinition.result = controller.percentageOf(StepDefinition.numbers);
    }

    @When("I click Get Percent")
    public void iClickGetPercent() {
        CalculatorController controller = new CalculatorController();
        StepDefinition.result = controller.getPercent(StepDefinition.numbers);
    }
}
