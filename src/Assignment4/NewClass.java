package Assignment4;

class NewClass 
{ 
	public static void main (String[] args) 
	{ 
		String str = "m a l a y a l am"; 
		
		if(isPalindrome(str)) 
			System.out.print("YES"); 
		else
		System.out.println("NO"); 
	} 
static int firstPos(String str, 
					int start, 
					int end) 
{ 
	int firstChar = -1; 
	
	for(int i = start; i <= end; i++) 
	{ 
		if(str.charAt(i) >= 'a'&& 
		str.charAt(i) <= 'z') 
		{ 
			firstChar = i; 
			break; 
		} 
	} 
	
	return firstChar; 
} 


static int lastPos(String str, 
				int start, 
				int end) 
{ 
	int lastChar = -1; 
	
	// Get the position of last 
	// character in the string 
	for(int i = start; i >= end; i--) 
	{ 
		if(str.charAt(i) >= 'a'&& 
		str.charAt(i) <= 'z') 
		{ 
			lastChar = i; 
			break; 
		} 
	} 
	
	return lastChar; 
} 


static boolean isPalindrome(String str) 
{ 
	int firstChar = 0, 
		lastChar = str.length() - 1; 
	boolean ch = true; 

	for (int i = 0; i < str.length(); i++) 
	{ 
		firstChar = firstPos(str, firstChar, 
								lastChar); 
		lastChar = lastPos(str, lastChar, 
								firstChar); 

		// break, when all 
		// letters are checked 
		if (lastChar < 0 || firstChar < 0) 
			break; 
		if (str.charAt(firstChar) == 
			str.charAt(lastChar)) 
		{ 
			firstChar++; 
			lastChar--; 
			continue; 
		} 
		
		// if mismatch found, 
		// break the loop 
		ch = false; 
		break; 
	} 

		return ch; 

} 


}
