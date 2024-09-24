import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepdefAdd {


    @When("press Add")
    public void pressAdd() {
        CalculatorController controller = new CalculatorController();
        StepDefinition.result = controller.add(StepDefinition.numbers);
    }


}
