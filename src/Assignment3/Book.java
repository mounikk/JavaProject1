package Assignment3;

public class Book {
	String Isbn;
	  String Title;
	  double price;

	        public Book(String IsbnIn, String  TitleIn, double priceIn)
	            {
	                Isbn  = IsbnIn;
	                Title = TitleIn;
	                price = priceIn;
	            }

	        public String getIsbn()
	            {
	                return (Isbn);
	            }

	        public String getTitle()
	            {
	                return (Title);
	            }

	        public double getPrice()
	            {
	                return (price);
	            }

	        public void setBook(String IsbnIn, String  TitleIn, double priceIn)
	            {
	                Isbn = IsbnIn;
	                Title = TitleIn;
	                price = priceIn;
	           }
}
