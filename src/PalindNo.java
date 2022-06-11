//A palindromic number (also known as a numeral palindrome or a numeric palindrome) is a number (such as 16461) that remains the same when its digits are reversed.
public class PalindNo {

	public static void main(String [] args)
	{
		int num=232;
		
		int temp=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		if (temp==rev)
		{
			System.out.println("palind");
		}
		else
		{
			System.out.println("not palind");
		}
	}
}
