package simpleAssignment;

import java.util.ArrayDeque;
import java.util.Scanner;

public class gloceryLineShuffle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayDeque<String> queue=new ArrayDeque<>();
		for(int i=0;i<5;i++) {
			String q=sc.nextLine();
			if(queue.size()%2==0) {
				
				queue.addFirst(q);
			}else {
				queue.addLast(q);
			}
		}
	}

}
