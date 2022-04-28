import java.util.HashMap;
import java.util.Map;

/*Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique. If you try to insert the duplicate key, it will replace the element of the corresponding key. It is easy to perform operations using the key index like updation, deletion, etc. HashMap class is found in the java.util package.

HashMap in Java is like the legacy Hashtable class, but it is not synchronized. It allows us to store the null elements as well, but there should be only one null key. Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value. It inherits the AbstractMap class and implements the Map interface.

Points to remember
Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.*/

public class HashMapEX {

	public static void main(String args[]) {
		
		  //int a = 10; int b = 20; int c = 67;
		 
		
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		  HashMap<String, String> hmap = new HashMap<String, String>();
		  
		  
		  hmap.put("aabc", "10dfdfdf"); hmap.put("agfxbc", "10du7tgfdfdf");
		  hmap.put("avbfbc", "7876566");
		  
		  
		  for (Map.Entry<String,String> entry : hmap.entrySet()) //using map.entrySet()for iteration() //The Map.Entry interface enables you to work with a mapentry. //The entrySet() method declared by the Map interface returns a Setcontaining the map entries. Each of these set elements is a Map.Entry object.{ //returns keys and values respectively 
		  System.out.println("key: " +entry.getKey() + ", value: " + entry.getValue());
		  
		  }
		 

		/*
		 * map.put("a", 10);
		 * 
		 * map.put("b", 20);
		 * 
		 * map.put("c", 67);
		 * 
		 * 
		 * System.out.println(map);
		 * 
		 * System.out.println(map.get("b"));
		 */
	}


