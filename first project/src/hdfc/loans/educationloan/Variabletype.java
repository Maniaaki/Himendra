package hdfc.loans.educationloan;

public class Variabletype 
{
     int x = 100;
	 static String cname = "Mani baby";
	int y=300;
	 
	public void m1()
	{
		int y = 200;
		System.out.println(x);
		System.out.println(y);
		System.out.println(cname);
	}
	public static void main(String[] args) 
	{
		 Variabletype obj = new Variabletype();
		 System.out.println(obj.x);
		 System.out.println(cname);
		 System.out.println(obj.y);
	}    
}
