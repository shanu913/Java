
public class ReverseString {

	public static void main (String [] args)
	{
		String input = "shanu";
		 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
		
		/*for(int item:a)
		{
			System.out.println(item);*/
		}

}
