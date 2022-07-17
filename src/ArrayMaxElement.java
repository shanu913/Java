
public class ArrayMaxElement {
	
	public static void main (String[] args)
	{
		int arr[]= {5, 4, 9, 2, 18};
		
		int len=arr.length;
		
		//System.out.println(len);
		
		int max=arr[0];
		
		for(int i=0; i<len;i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("Max element is " + max);
	}


}
