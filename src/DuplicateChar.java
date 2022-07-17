
public class DuplicateChar {
	
	public static void main(String [] args)
	{
		String str="shasnsua te tet"; int count=0;
		
		int len=str.length();
		System.out.println(len);
		char []ch=str.toCharArray();
		
		int e= ch.length;
		
		System.out.println(e);
		
		for (char item: ch)
		{
			System.out.print(item + ",");
		}
		
		System.out.println(" ");
		for(int i=0; i<e; i++)
		{
			count=1;
			for(int j=i+1; j<e; j++)
			{
				if (ch[i]==ch[j] ) 
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
