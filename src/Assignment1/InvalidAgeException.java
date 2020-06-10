package Assignment1;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
		System.out.println("Invalid age");
	}
}
