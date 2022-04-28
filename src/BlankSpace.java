
public class BlankSpace {
	
	public static void main (String [] args)
	{
		String str= "This is      testing";
		
		String rstr= str.replaceAll("\\s", ""); // \\s Find a whitespace character
		
		System.out.println(rstr);
	}

}
