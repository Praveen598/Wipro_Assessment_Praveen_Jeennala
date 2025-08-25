package java8Features;

import java.util.Arrays;
import java.util.List;

public class FrequentlyMapped {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Praveen", "Ravi", "Kiran", "Manoj");

        names.stream()
             .map(String::toUpperCase)  // frequently mapped example
             .forEach(System.out::println);
    }
}
