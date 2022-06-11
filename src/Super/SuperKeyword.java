package Super;

public class SuperKeyword {
	String color = "white";
}

class Dog extends SuperKeyword {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Dog class
		System.out.println(super.color);// prints color of Animal class
	}
}
