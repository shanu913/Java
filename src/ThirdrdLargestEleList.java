import java.util.ArrayList;
import java.util.Collections;

public class ThirdrdLargestEleList {
	
	public static void main(String[] args) 

	{
	
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(4);
		
		list.add(6);
		
		list.add(1);
		
		list.add(17);
		
		Collections.sort(list);
		
		int element= list.get(list.size()-3);
		System.out.println(element);
		
		
	}

}



