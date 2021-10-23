package Assignmentjava;

public class Strongnum {

	public static void main(String[] args) {
		int n=145;
		int temp,mod,sum=0;
		temp=n;
		while(n>0)
		{
			mod=n%10;
			sum=sum + fact(mod);
			n=n/10;
		}
		if(temp == sum)
		{
			System.out.println(temp + "is a strong number");
		}
		else
		{
			System.out.println(temp + "is not a strong number");
			
			
		}
	}
 public static int fact(int num)
 {
	 int fact=1;
	 for(int i=1;i<=num;i++) {
		 fact*=i;
	 }
	 return fact;
 }
}
