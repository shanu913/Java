import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElementsArrayList {
	public static void main(String args[]) {

		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(7);
		list.add(8);
		list.add(7);

		HashSet<Integer> set= new HashSet<Integer>(list);

		System.out.println(set);

	}
}