package Assignment5;

public class Occurrence {

	public static void main(String[] args)
    {
        
        String str = " Paris is a lovely place";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurances of 'l' in string is = "+count);
    }
}
