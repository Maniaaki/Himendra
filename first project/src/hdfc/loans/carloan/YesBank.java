package hdfc.loans.carloan;

public class YesBank implements RBI
{

	public static void main(String[] args) 
	{
		YesBank i = new YesBank();
			i.deposit();
			i.withdrwal();
	}

	@Override
	public void withdrwal() {
		System.out.println("with draw YesBank");
	}

	@Override
	public void deposit() {
		System.out.println("deposit YesBank");	
		
	}

}
