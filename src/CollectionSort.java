import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String args[]) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(9);
		list.add(7);
		list.add(8);
		list.add(7);
		
		Collections.sort(list);	// ascending order
		Collections.sort(list, Collections.reverseOrder());//Descending order
		
		for (Integer item: list)
			
		{
			System.out.println(item);
		}
		
		
	
		}

	}
