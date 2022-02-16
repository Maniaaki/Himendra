package hdfc.loans.educationloan;

import hdfc.loans.carloan.A;

public class C extends A
{
	public void m3()
	{
		System.out.println("i am m3 in C");
	}
	public void m4()
	{
		System.out.println("i am m4 in C");
	}
	public void m1()
	{
		System.out.println("i am override m1 in C");
	}
	public static void main(String[] args) 
	{
		A a =new A();
		a.m1();
		
		C c =new C();
		c.m1();
		c.m3();
		c.m4();
		
		A obj= new C();
		obj.m1();
	}

}
