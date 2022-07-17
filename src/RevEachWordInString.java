
public class RevEachWordInString {
	
	public static void main (String [] args)
	{
		String str="my name is shanu";
		String revString=""; //empty
		
		String a[]=str.split(" ");//delimiter // [my, name, is, shanu]
		System.out.println(a.length);	
		
		for (int i=0; i<a.length; i++)
		{
			String word=a[i];
			String revword="";
			
			 for (int j=word.length()-1; j>=0; j--)
			 {
				 revword=revword+word.charAt(j);
				 //System.out.println(revword);
			 }
			 
			 revString=revString+revword+ " ";
		}
		
		System.out.println(revString);
	}

}
