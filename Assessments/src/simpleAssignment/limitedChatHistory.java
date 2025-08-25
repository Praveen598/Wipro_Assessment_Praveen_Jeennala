package simpleAssignment;

import java.util.ArrayDeque;
import java.util.Scanner;

public class limitedChatHistory {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayDeque<String> s=new ArrayDeque<>();
		for(int i=0;i<10;i++) {
			String msg=sc.nextLine();
			if(s.size()!=4) {
				s.addFirst(msg);
			}else {
				s.removeFirst();
				s.addFirst(msg);
			}
		}
	}

}
