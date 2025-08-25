package simpleAssignment;

import java.util.Scanner;

public class avrg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= new int[5];
		System.out.println("enter 5 values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<10) {
				a[i]=a[i]*2;
			}
		}
		int avrg=0;
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		avrg=sum/a.length;
		System.out.println("the avrg confusion is"+avrg);
		
	}

}
