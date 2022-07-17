import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main (String args[])
	{
		//Integer arr[]= {2, 5, 7,1};
		
		int arr[]= {6, 5,2};
		
		//System.out.println("Before sorting " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		//Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println("After sorting " + Arrays.toString(arr));
	}

}
