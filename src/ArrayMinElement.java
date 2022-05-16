
public class ArrayMinElement {

	public static void main(String[] args) {
		int arr[]= {6, 2, 8};
		int min=arr[0];
		int len=arr.length;
		
		for(int i=1; i<len;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		
		System.out.println(min);
		

	}

}
