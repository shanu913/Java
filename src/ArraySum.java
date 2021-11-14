
public class ArraySum {
	
	public static void main(String args [])
	{
		int arr[]=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		int sum=0;
		int len=arr.length;
		//System.out.println(len);
		for(int i=0; i<len; i++)
		{
			//System.out.print(arr [i] + " ");
			sum=sum+arr[i];

		}
		//loop1 sum= 0 + 1;
		//loop2 sum= 0 + 1 + 2;
		
		System.out.println(sum);
	}

}
