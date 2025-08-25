package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<String> names=Arrays.asList("Apraveen","asatish","murali","moses");
		names.stream().filter(n->n.length()>5).forEach(System.out::println);
	}

}
