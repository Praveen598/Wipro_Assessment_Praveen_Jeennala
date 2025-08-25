package simpleAssignment;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class printManager {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayBlockingQueue<String> arr=new ArrayBlockingQueue<>(4);
		for(int i=0;i<4;i++) {
			String job=sc.nextLine();
			arr.add(job);
		}
		System.out.println("queue full");
		for(String e:arr) {
			System.out.println(e);
		}
		
	}

}
