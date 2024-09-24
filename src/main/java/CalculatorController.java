import java.util.ArrayList;
import java.util.List;

public class CalculatorController {
    public double add(List<Double> numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    public double modulus(ArrayList<Double> numbersForModulus) {
        return numbersForModulus.get(0) % numbersForModulus.get(1);
    }

    public double subtract(double a, double b) {
        return 0;
    }

    public double percentageOf(double a, double b) {
        return a/100*b;
    }

    public double getPercent(Double a, Double b) {
        return a/b*100;
    }
}
