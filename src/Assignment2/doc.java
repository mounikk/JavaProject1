package Assignment2;

public class doc {
	private String text;

	public doc(String textDoc)
	{
		setText(textDoc);
	}
	public void setText(String newTextDoc) 
	{
		text = newTextDoc;
	}
	public String toString()
	{
		return text;
	}
}
