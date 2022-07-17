package Super;

public class CountSpaceInString {

	public static void main(String[] args) 

	{
	
		String str="This string has nine spaces and a Tab:"; int count=0;
		char ch[]=str.toCharArray();
		for (char c:ch)
		{
			if (c==' ')
				count++;
		}
		
		System.out.println(count);
	}

}
