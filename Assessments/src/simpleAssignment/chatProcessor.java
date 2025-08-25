package simpleAssignment;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class chatProcessor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayBlockingQueue<String> s=new ArrayBlockingQueue<>(4);
		int n=10;
		int k=0;
		while(n!=0) {
			String ss=sc.nextLine();
			for(int i=k;i<5;i++) {
				System.out.println(ss.charAt(i));
				k++;
			}
		}
	}

}
