package hdfc.loans.carloan;

public class ThirdClass {
	
	// data properties
	int a=10,b=20,result;
	
	//behaviours
	public void add()
	{
		result=a+b;

		System.out.println("A+b:"+result);			
	}
	public void sub()	
	{
		result=a-b;
		System.out.println("A-B:"+result);
	}
	public static void main(String[] args) 
	{
		ThirdClass obj= new ThirdClass();
		obj.add();
		obj.sub();
		ThirdClass obj1= new ThirdClass();
		obj.add();
		obj.sub();
	}
}	
		
		
			
		
		
	
	

		

