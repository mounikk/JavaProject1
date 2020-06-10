package Assignment4;

public class CreditCardPayment extends Payment 
{

	public String name, expDate, number;

	CreditCardPayment(double value, String name, String expDate, String number) 
	{
		super(value);
		this.number = number;
		this.expDate = expDate;
		this.name = name;
	}

	public void paymentDetails() {
	System.out.println("The payment of $" + this.cash + " through the card " + this.number
        + ",  and expire date "	+ this.expDate + ", and the owner name: " + this.name + ".");
	}
}