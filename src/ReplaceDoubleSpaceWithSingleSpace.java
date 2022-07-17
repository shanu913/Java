
public class ReplaceDoubleSpaceWithSingleSpace {
	
	public static void main(String[] args) 
	{
		String str="this   is   testing";
		
		//String replace=str.replaceAll("\\s{2,}", " ");
		//System.out.println(replace);
		
		String resultStr = str.replaceAll("[ ]+", " "); //The string “[ ]+” is a regular expression representing one or 
														//more regular spaces next to each other.
		
		System.out.println(resultStr);
		
	}
}