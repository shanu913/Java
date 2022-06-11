import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String [] args)
	{
		Map<Integer, String> map= new HashMap<Integer, String> ();
		
		map.put(1, "Shanu");
		
		map.put(2, "Ram");
		
		map.put(3, "Mohan");
		
		
//		for (Integer item: map.keySet())
//		{
//			System.out.println(item);
//		}
//		
//		for (String value: map.values())
//		{
//			System.out.println(value);
//		}
			
			
//		System.out.println(map.get(1));
		
		for(Map.Entry<Integer, String> data: map.entrySet())
		{
			//System.out.println(data.getKey()+ " " + data.getValue());
			
			//System.out.println(data);
			
			int rollNo=data.getKey();
			
			//String name=data.getValue();
			
			if (rollNo==3)
			{
				String name=data.getValue();
				System.out.println(name);
			}
		}
	}
	
}

