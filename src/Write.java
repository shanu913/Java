import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void main(String[] args) {
		try {


			FileWriter myObj = new FileWriter("test123.txt");
			myObj.write("Files in Java might be tricky, but it is fun enough!123");

			myObj.close();

			System.out.println("Successfully wrote to the file.");
		} 

		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
