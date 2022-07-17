import java.util.HashMap;
import java.util.Map;

public class HashMap3 {
	
	public static void main(String[] args) 
	{
		Map<Integer, String> map=new HashMap<Integer, String>();

		map.put(101, "Shanu");

		map.put(102, "Ram");
		
		map.put(103, "RRam");
		
		System.out.println(map.get(102));
		
		for(Map.Entry<Integer, String> data: map.entrySet())
		
		{
			//System.out.println(data.getKey()+ " " + data.getValue());
			
			if (data.getKey()==103)
			{
				String value=data.getValue();
				System.out.println(value);
			}
		
		}
	}
}

