package hdfc.loans.educationloan;

class Parent 
{
	public void workhard()
	{	
	System.out.println("Parent : Wakeup early,goto college");
    }
   public void care()
   {
	   System.out.println("Parent : atmost care");
   }
    public class Child extends Parent
{
	public void love()
	{
		System.out.println("Child : i am in love......");
	}
	public void main(String[] args) 
	{
		Child Obj = new Child();
		Obj.love();
		Obj.workhard();
		Obj.care();
	}
}
}



