//A string is called a palindrome string if the reverse of that string is the same as the original string. For example, radar , level , etc. 
//Similarly, a number that is equal to the reverse of that same number is called a palindrome number. For example, 3553, 12321, etc.
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
