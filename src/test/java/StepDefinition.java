import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinition {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static int result = 0;

    @Given("I have the number {int}")
    public void iHaveTheNumber(int arg0) {
        numbers.add(arg0);
    }

    @Then("I want to see the result {int} in my display.")
    public void iWantToSeeTheResultInMyDisplay(int arg0) {
        assertEquals(arg0, result);
        numbers.clear();
    }
}
