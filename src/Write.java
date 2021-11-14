import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	
	public static void main (String args[]) throws IOException
	{
		File myobj=new File ("demo.txt");
		
		if(!myobj.exists())
		{
			myobj.createNewFile();
			
		}
		
		FileWriter mywrite= new FileWriter(myobj);
		mywrite.write("This is testing");
		mywrite.close();
		System.out.println("Done");
	}

}
