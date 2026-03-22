
public class findVowels {
	//Method to check if letter is vowel
	public static char isVowel(char letter1) {
		String vowels = "AEIOUYaeiouy";
		
		for(int i = 0; i < vowels.length(); i++) {
			char vowelChar = vowels.charAt(i);
			
			if(letter1 == vowelChar) {
				//If letter is a vowel return the letter
				return vowelChar;
			}
		}
		return '\0';
	}
		

}
