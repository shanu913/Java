
public class DuplicateChar {
	
	public static void main(String [] args)
	{
		String str="shasnsua te tet"; int count=0;
		
		int len=str.length();
		char []ch=str.toCharArray();
		
		
		for(int i=0; i<len; i++)
		{
			count=1;
			for(int j=i+1; j<len; j++)
			{
				if (ch[i]==ch[j] && ch[i]!=' ') 
				{
					count++;
					ch[j]='0';
			
				}
			}
			
			if (count>1 && ch[i]!='0')
			{
				System.out.println(ch[i]);
			}
		}
		
	
	}

}
