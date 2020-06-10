package Assignment3;

public class Magazine extends Book {
String Type;
    
    public Magazine(String IsbnIn , String TitleIn, double priceIn, String TypeIn)
        {
            super (IsbnIn ,TitleIn, priceIn);
            Type = TypeIn;
         }

    public void setBook(String IsbnIn, String TitleIn, double priceIn)
        {
            IsbnIn = Isbn;
            TitleIn = Title;
            priceIn = price;
        }

    public String getType()
        {
            System.out.println("The Type of this magazine is " + Type);
            return (Type);
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
