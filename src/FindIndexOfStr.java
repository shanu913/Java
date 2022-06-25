
public class FindIndexOfStr 
{
	
	public static void main(String[] args) 
	
	{
		String str="this is test this";
		
		String [] a= str.split(" ");
		
		System.out.println(a[3]);
		
		int len=a.length;
		
		System.out.println(len-1);
	}

}
