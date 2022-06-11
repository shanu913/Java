
public class DublicateChar {
	
	public static void main(String [] args)
	{
		String str="shansua"; int count=0;
		
		int len=str.length();
		char []ch=str.toCharArray();
		
		
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if (ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					count++;
			
				}
			}
		}
		
		System.out.println(count);
	}

}
