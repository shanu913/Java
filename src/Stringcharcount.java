
public class Stringcharcount {
	
	public static void main(String[] args) 
	{
		
		String str="MISSISIPPI"; int count=0;
		
		int len=str.length();
		
		for (int i=0; i<len; i++)
		{
			if(str.charAt(i)!=' ')
			{
				
				count++;
			}
		}
		
		System.out.println(count);
		
		

	}
}



