package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class hii{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> names=Arrays.asList("Apraveen","asatish","murali","moses");
		Stream<String> s1=names.stream();
		s1.filter((n)-> n.startsWith("A")).forEach(System.out::println);
	}
}