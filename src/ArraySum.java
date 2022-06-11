import java.util.Scanner;

public class ArraySum {

	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input your value ...");
		
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		a=a+b;
		
		b=a-b;
		
		a=a-b;
		
		System.out.println("After swapping a= " + a + "b = " +b);
	}

}
