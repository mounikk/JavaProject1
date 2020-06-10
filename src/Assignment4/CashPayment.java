package Assignment4;

public class CashPayment extends Payment{
  
	CashPayment(double val) 
	{
		super(val);
	}

	public void paymentDetails()
	{
		System.out.println("The payment of cash:  $" + this.cash);
	}
}
