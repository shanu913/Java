
public class DublicateWords {


	//Input = "my name is shanu is my"
	//Output = "is my"

		public static void main(String [] args)
		{
			String str="my name is shanu my name is";  int count=0;
			
			//String [] astr= {"my", "name", "is", "shanu", "is", "my" };
		//String	s=str.toLowerCase();
			String words[] = str.split(" ");    
			int len=words.length;
			
			for(int i=0; i<len; i++)
			{
				count=1;
				for (int j=i+1; j<len; j++)
				{
					if ( words[i].equals(words[j]))
					{
						count++;
						words[j] = "0"; 			
					}
				}
				 if(count > 1 && words[i] != "0")    
		                System.out.println(words[i]);    
			}
			
			
			
		}
	}


