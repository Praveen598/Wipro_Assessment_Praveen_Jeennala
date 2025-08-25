package java8Features;

import java.util.Arrays;
import java.util.List;

public class parallelSqare {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(2,3,4,6,7,7,8,8,8,88,43,6,5,4,3);
		li.parallelStream().map(n->n*n).forEach(System.out::println);
		
	}

}
