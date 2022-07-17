package Super;

//https://www.programiz.com/java-programming/do-while-loop#syntax-while

public class While {
	public static void main(String args[]) {
//		int x = 1;
//
//		while (x <= 1000) {
//
//			System.out.println(x);
//
//			x++;
		int i=1; 
		int num=10;
		while(i<=num)
		{
			System.out.println(i);
			i++;
			
			if (i==9)
			{
				break;
			}
		}
	}
}
