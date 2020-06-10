package Assignment4;

public class MainTest {
 
	public static void main(String[] args) 
{
CreditCardPayment x = new CreditCardPayment(33, "Monika","02/22", "************555");

		CashPayment p = new CashPayment(55);

		x.paymentDetails();
		p.paymentDetails();
  }
}
