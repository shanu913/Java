
//https://www.youtube.com/watch?v=knr4Iax6mOI

public class digitscount {

	public static void main(String[] args) {
		int n=6543;
		int count=0;
		while(n>0)
		{
			n=n/10;
			 count ++;
		}
		
		System.out.println(count);
		
	}

}


