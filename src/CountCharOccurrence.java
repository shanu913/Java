import java.util.Scanner;

//https://www.youtube.com/watch?v=jbGxTi0bi7c

public class CountCharOccurrence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next(); 
		
		
		//String s="This is testing";
		int len=str.length();
		int countafterremove=str.replace("t", "").length();
		//System.out.println(countafterremove);
		int count=len-countafterremove;
		System.out.println(count);

	}

}
