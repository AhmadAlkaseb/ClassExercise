import java.util.ArrayList;
import java.util.List;

public class CalculatorController {
    public int add(List<Integer> numbers) {
        int result=0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }

    public int modulus(ArrayList<Integer> numbersForModulus) {
        return numbersForModulus.get(0) % numbersForModulus.get(1);
    }

    public int subtract(Integer integer, Integer integer1) {
        return 0;
    }
}
