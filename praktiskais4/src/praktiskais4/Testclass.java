package praktiskais4;

public class Testclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		for(int i=0 ; i < 20; i++) 
		{
		  System.out.println("Printing stuff");
		}
		Newclass1 cl = new Newclass1("This is my class",123);
		System.out.print(cl.GetString());
		cl.Printclassinfo(cl);
		cl.addletter(cl.getClstring(), "asd");
	}

}
