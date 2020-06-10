package Assignment4;

public abstract class Payment {
	
		protected double cash;
		Payment(double val) 
		{
				this.cash = Math.round(val*100)/100.0;
			}
		public double getcash() 
		{
				return cash;
			}
		public void setcash(double newval) 
		{
				this.cash = newval;
			}
		public void paymentDetails() 
		{
				System.out.println("The payment of cash: $" +this.cash);
			}
}
