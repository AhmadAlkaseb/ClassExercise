import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinition {
    public static ArrayList<Double> numbers = new ArrayList<>();
    public static double result = 0;

    @Given("I have the number {double}")
    public void iHaveTheNumber(double arg0) {
        numbers.add(arg0);
    }

    @Then("I want to see the result {int} in my display.")
    public void iWantToSeeTheResultInMyDisplay(double arg0) {
        assertEquals(arg0, result);
        numbers.clear();
    }

}
