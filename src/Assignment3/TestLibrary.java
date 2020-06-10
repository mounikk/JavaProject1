package Assignment3;

public class TestLibrary {
	public static void main(String args[])
    {     
      Magazine magazine1 = new Magazine ("ISBN1112", "Ayup Magazine",99, "Comic");
      magazine1.getIsbn();
      magazine1.getTitle();
      magazine1.getPrice();
      magazine1.getType();
      System.out.println();

      
      Novel  Novel1 = new Novel ("ISBN13332","Avenger",979, "Jay");
      Novel1.getIsbn();
      Novel1.getTitle();
      Novel1.getPrice();
      Novel1.getAuthor();
      System.out.println();        
    }
}
