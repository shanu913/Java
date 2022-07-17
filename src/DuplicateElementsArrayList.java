import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//https://www.youtube.com/watch?v=D42jIaoFM1c

public class DuplicateElementsArrayList {

	public static void main(String[] args) 

	{

		ArrayList<String> list= new ArrayList<String>();

		list.add("Shanu");
		list.add("Ram");
		list.add("Shanu");

		Set<String> s = new LinkedHashSet<String>();

		for(String name : list) {
			if(s.add(name) == false)// When we get the false value print the name
				System.out.println(name + " is duplicated");
			
		
			

		}
	}
}