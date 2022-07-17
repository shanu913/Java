

public class CountSpaceInString {

	public static void main(String[] args) 

	{
		
		
		
	//	System.out.println(len);
	
		String str="This string has nine spaces and a Tab:"; int count=0;
	//	int len=str.replaceAll("[^ ]", "").length();
//		System.out.println(len);
		char ch[]=str.toCharArray();
		for (char c:ch)
		{
			if (c==' ')
				count++;
		}
		
		System.out.println(count);
	}

}
