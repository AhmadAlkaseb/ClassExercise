import java.util.ArrayList;
import java.util.List;

public class CalculatorController {
    public double add(List<Double> numbers) {
        double result = 0;
        for (Double number : numbers) {
            result += number;
        }
        return result;
    }

    public double modulus(ArrayList<Double> numbersForModulus) {
        return numbersForModulus.get(0) % numbersForModulus.get(1);
    }

    public double subtract(List<Double> numbers) {
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }
        return result;
    }

    public double divide(List<Double> numbers) {
        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result /= numbers.get(i);
        }
        return result;
    }
}
