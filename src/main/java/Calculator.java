import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    static public void calculator(){
    CalculatorController controller = new CalculatorController();
    Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("\n1. Add\n2. Subtract\n3. Divide\n4. Modulus\n5. Exit");
        System.out.print("Enter choice (1-5): ");
        int choice = scanner.nextInt();

        if (choice == 5) {
            System.out.println("Exiting...");
            break;
        }

        if (choice < 1 || choice > 5) {
            System.out.println("Invalid choice. Try again.");
            continue;
        }

        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(a);
        numbers.add(b);

        double result = 0;
        switch (choice) {
            case 1: result = controller.add(numbers); break;
            case 2: result = controller.subtract(numbers); break;
            case 3: result = controller.divide(numbers); break;
            case 4: result = controller.modulus(numbers); break;
        }

        System.out.println("Result: " + result);
    }
        scanner.close();
}
}