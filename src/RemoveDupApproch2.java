import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDupApproch2 {
	
	public static void main(String[] args) 
	{
		
		Integer [] arr= {5,3,1,4,3};
		
		HashSet<Integer> set=new HashSet<>(Arrays.asList(arr));
		
		
		System.out.println(set);

	}
}


