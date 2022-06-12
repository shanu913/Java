
//https://www.youtube.com/watch?v=oO1AcSPt08o&t=901s
public class DuplicateWords {


	//Input = "my name is shanu is my"
	//Output = "is my"

		public static void main(String [] args)
		{
			String str="my name is shanu my name is";  int count=0;
			
			//String [] astr= {"my", "name", "is", "shanu", "is", "my" };
		//String	s=str.toLowerCase();
			String words[] = str.split(" "); // The split() method divides the string at 
											//the specified regex and returns an array of substrings.
											//The Java Regex or Regular Expression is an API to define a pattern for searching or 
																						//manipulating strings.
			int len=words.length;
			
			//printing string array

			for (int i=0; i<len;i++)
			{
				System.out.print(words[i] + ", ");
			}
			
			System.out.println("");
			for(int i=0; i<len; i++)
			{
				count=1;
				for (int j=i+1; j<len; j++)
				{
					//my, name, is, shanu, my, name, is, 
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


