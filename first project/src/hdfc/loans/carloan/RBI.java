package hdfc.loans.carloan;
public interface RBI 
{
    public void withdrwal();
	public void deposit();
	public static void main(String[] args)
	{
		//RBI i = new RBI();
		RBI i;
		i= new icici();
		i.deposit();
		i.withdrwal();
		
		i= new YesBank();
		i.deposit();
		i.withdrwal();		
	}
}
