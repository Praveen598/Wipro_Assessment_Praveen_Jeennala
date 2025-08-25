package simpleAssignment;

import java.util.LinkedList;
import java.util.Scanner;

public class ReversetaskQueue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> tasks=new LinkedList<String>();
	      for(int i=0;i<4;i++) {
	    	  String task=sc.nextLine();
	    	  if(task.endsWith("!")) {
	    		  tasks.addFirst(task);
	    	  }
	    	  else {
	    		  tasks.addLast(task);
	    	  }
	      }
	      
	      for(int i=tasks.size()-1;i>=0;i++) {
	    	  System.out.println(tasks.get(i));
	      }
		
	}

}
