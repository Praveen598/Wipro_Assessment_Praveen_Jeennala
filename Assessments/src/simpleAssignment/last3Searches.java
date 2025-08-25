package simpleAssignment;

import java.util.ArrayDeque;
import java.util.Scanner;

public class last3Searches {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayDeque<String> searchs=new ArrayDeque<>();
		for(int i=0;i<5;i++) {
			System.out.println("enter the searches");
			String s=sc.nextLine();
			if(searchs.size()!=3) {
				searchs.addFirst(s);
			}else {
				searchs.removeFirst();
				searchs.addFirst(s);
			}
		}
	}

}
