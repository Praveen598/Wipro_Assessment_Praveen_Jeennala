package java8Features;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class evenNumberCollector {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(2,3,4,6,7,7,8,8,8,88,43,6,5,4,3);
		li.stream().filter(n-> n%2==0).forEach(System.out::println);
	}

}
