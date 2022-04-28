
public class JunkChar {
	
	public static void main(String[] args)
	{
		String str="This#string%contains^special*characters&.";  
		String rstr =str.replaceAll("[^a-zA-Z0-9]", "");  //[^abc]	Find one character NOT between the brackets
		System.out.println(rstr);
		
	}
	}


