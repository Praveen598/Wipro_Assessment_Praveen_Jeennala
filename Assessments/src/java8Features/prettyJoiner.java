package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prettyJoiner {
	public static void main(String[] args) {
		List<String > ss=Arrays.asList("rjuy","hyd","vzg");
		ss.stream().collect(Collectors.joining());
	}

}
