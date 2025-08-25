package java8Features;

import java.util.Optional;

public class SafeDivider {

    // Method that safely divides two numbers and returns Optional
    public static Optional<Double> divide(double numerator, double denominator) {
        if (denominator == 0) {
            return Optional.empty(); // no valid result
        } else {
            return Optional.of(numerator / denominator);
        }
    }

    public static void main(String[] args) {
        // Example 1: valid division
        Optional<Double> result1 = SafeDivider.divide(10, 2);
        result1.ifPresentOrElse(
                value -> System.out.println("Result: " + value),
                () -> System.out.println("Cannot divide by zero")
        );

        // Example 2: division by zero
        Optional<Double> result2 = SafeDivider.divide(5, 0);
        result2.ifPresentOrElse(
                value -> System.out.println("Result: " + value),
                () -> System.out.println("Cannot divide by zero")
        );
    }
}

