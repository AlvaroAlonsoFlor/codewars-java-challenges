package simple_encryption;

public class SympleEncryption {
	 public static String encrypt(final String text, final int n) {
		 
		if (text == null || text == "" || n <= 0) {
			return text;
		
		}
		
		String firstString = "";
		String secondString = "";
		
		for (int i = 0; i <= text.length() - 1; i++) {
			
			// Every second char into a new string
			if (i == 0 || i % 2 == 0) {
				secondString += text.charAt(i);
			} else {
				firstString += text.charAt(i);
			}
		}	
		
		// Handle number of times
		if (n == 1) {
			return firstString + secondString;
		} else {
			return SympleEncryption.encrypt(firstString + secondString, n - 1);
		}
		   
	 }
		  
	 public static String decrypt(final String encryptedText, final int n) {
		 
		 if (encryptedText == null || encryptedText == "" || n <= 0) {
				return encryptedText;
			
		}
		 
		 String result = "";
		 
		 // Add chars from each part in each iteration

		 for (int i = 0; i <= encryptedText.length() / 2 - 1; i++) {
			int secondIndex = (encryptedText.length() / 2) + i;
			result += encryptedText.charAt(secondIndex);
			result += encryptedText.charAt(i);
		 }
		 
		 // if sentence is uneven add the last char
		 if (encryptedText.length() % 2 != 0) {
			result += encryptedText.charAt(encryptedText.length() - 1); 
		 }
		 
		 // Handle number of times
		 
		 if (n == 1) {
			return result;
		 } else {
			return SympleEncryption.decrypt(result, n - 1);
		 }
	 }
}
