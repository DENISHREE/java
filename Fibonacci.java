package p310;
import java.util.Scanner;
public class fib {
	public static void main(String args[])
	{
	int n1=0,n2=1,n3;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(n1);
	System.out.println(n2);
	int i;
	for(i=2;i<=n;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	}
}
