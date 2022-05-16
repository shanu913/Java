import java.util.Arrays;

public class ArraySortUsingLoop {

	public static void main(String[] args) {
	
		/*int arr[]= {2,5, 8, 9,4};
		int temp;
		System.out.println("Before sorting:\n" + Arrays.toString(arr));
		
		int len=arr.length;
		
		Arrays.sort(arr);
		
		System.out.println("Before sorting:\n" + Arrays.toString(arr));
	}
	

}
*/
		int arr []={3,1,4,5,2};
        int len=arr.length;
        //System.out.println(len);
        
        for(int i=0; i<len; i++)
        {
            for(int j=i+1; j<len; j++ )
            {
                if (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        for (int item:arr)
        {
            System.out.println(item);
        }
       // System.out.println(arr[0]);
    }
}