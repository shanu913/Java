package Super;

public class ThisKeyWord {

	String name;
	int age;
	
	ThisKeyWord(String name, int age)
	{
		this.name=name;
		this.age=age;	
	}
	
	public void show()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[]args)
	{
		ThisKeyWord T=new ThisKeyWord("Shanu", 101);
		T.show();
	}
}

