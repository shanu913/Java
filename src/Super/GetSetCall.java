package Super;

public class GetSetCall {
	
	public static void main (String [] args)
	{
		GetSetEx T= new GetSetEx();
		T.setName("shanu");
		T.seid(101);
		T.setage(28);
		
		System.out.println(T.getname() + " " + T.getid() + " " + T.getage() );
		
		
	}
	
}



