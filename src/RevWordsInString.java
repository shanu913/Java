
public class RevWordsInString {

	public static void main(String [] args)
	{
		String str= "my name is shanu";

		String rev="";

		String a[]=str.split(" ");

		System.out.println("length is " + a.length);

		for (int i=0; i<a.length; i++)
		{
			System.out.print (a[i]+ " ");

		}
		System.out.println(" ");
		for (int i=a.length-1; i>=0; i--)
		{
			rev=rev+a[i]+" ";
		}
		System.out.println(rev);
	}

}
