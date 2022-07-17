import java.util.Hashtable;
import java.util.Map;

public class OccurrenceOfEachCharacter {

	public static void main(String[] args) 
	{
		
		String str="MISSISIPPI";
		
		Map<Character, Integer> map=new Hashtable<Character, Integer> ();
		
		char ch[]=str.toCharArray();
		
		for (char c:ch)
		{
			if (!map.containsKey(c))
			{
				map.put(c, 1);
			}
			else
			{
				int value=map.get(c);
				map.put(c, value+1);
			}
		}
		
		System.out.println(map);

	}
}

