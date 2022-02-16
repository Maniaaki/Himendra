package hdfc.loans.educationloan;

public class Employee 
{
  int eno;
  String ename;
  
  public Employee()
  {
	  System.out.println("i am the costructor");
  }
  
  public Employee(int eno,String ename)
  {
	  this.eno=eno;
	  this.ename=ename;
  }
  
  
 public Employee(int eno) {
	super();
	this.eno = eno;
}

public static void main(String[] args) 
{
	 Employee e1 = new Employee();
	 System.out.println(e1.eno);
	 System.out.println(e1.ename);
	 
	 Employee e2 = new Employee(7224,"Baby");
	 System.out.println(e2.eno);
	 System.out.println(e2.ename);
	 
	 Employee e3 = new Employee(7223,"mani");
	 System.out.println(e3.eno);
	 System.out.println(e3.ename);
	 
	 
	 
	
}

}
