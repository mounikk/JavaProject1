package Assignment3;

public class Novel extends Book {
	String Author;
    public Novel(String IsbnIn , String TitleIn, double priceIn, String AuthorIn)
      {
          super (IsbnIn ,TitleIn, priceIn);

          Author = AuthorIn;
       }

  public void setBook(String IsbnIn, String TitleIn, double priceIn)
      {
          IsbnIn = Isbn;
          TitleIn = Title;
          priceIn = price;
      }

  public String getAuthor()
      {
          System.out.println("The Type of this magazine is " + Author);
          return (Author);
      }

      public String getIsbn()
      {
          System.out.println("The Isbn of this magazine is " + Isbn);
          return (Isbn);
      }

  public String getTitle()
      {
          System.out.println("The publication title of this magazine is " + Title);
          return (Title);
      }

  public double getPrice()
      {
          System.out.println("The price of this magazine is " + price);
          return (price);
      }
}
