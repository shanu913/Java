
public class MissinNoInArray {

	public static void main(String[]args)
	{
		int arr[]= {1,4,2}, sum=0, sum1=0;
		for (int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			
		}
		
		System.out.println("sum is =" + sum);
		
		for (int i=1; i<=4; i++)
		{
			sum1=sum1+i;
		}
		
		System.out.println("sum1=" +sum1);
		
		System.out.println("missing value is= " + (sum1-sum));
	}
}
