package Assignmentjava;

import java.util.Scanner;

public class Marble {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,t1=0,t2=1,nextterm=0,i;
	 System.out.println("enter the number");
	 n=sc.nextInt();
     if(n==0||n==1)
    	 System.out.println(n);
     else
    	 nextterm=t1+t2;
     for(i=3;i<=n;i++)
     {
    	 t1=t2;
    	 t2=nextterm;
    	 nextterm=t1+t2;
     }
     System.out.println(t2);
	}

}
