
public class DuplicateElementsinArray {

	public static void main(String[]args)
	{

		int arr[]= {2, 5, 2, 6, 5,9};

		int len=arr.length;

		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}

		}
	}
}