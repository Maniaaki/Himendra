package hdfc.loans.carloan;

public class icici implements RBI
{

	public static void main(String[] args) 
	{
	
	icici i=new icici();
	i.deposit();
	i.withdrwal();
	

	}

	@Override
	public void withdrwal() {
		System.out.println("with draw from icici");
	}

	@Override
	public void deposit() {
		System.out.println("depositto icici");
	}
		
}


