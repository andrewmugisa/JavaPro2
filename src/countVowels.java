/*
* Student Name: Andrew Mugisa
* Lab Professor: James
* Due Date: 2026-03-22
* Modified: 2026-03-22
* Purpose: To initiate analysis of a string by counting vowels and computing related statistics.
*/
public class countVowels {
	static public void countMethod(String sentence) {
		
		//initial counts of each vowel
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		int countY = 0;
		int counta = 0;
		int counte = 0;
		int counti = 0;
		int counto = 0;
		int countu = 0;
		int county = 0;
		
		int totalCharacters = 0;
		
		//extract letter at each index in sentence and assign it to a variable "letter"
		for(int i = 0; i < sentence.length(); i++) {
			char character = sentence.charAt(i);
			
		
			if (Character.isLetter(character)) {
				totalCharacters++;
			
				//use method isVowel to check all the letters in sentence and count the returned values of each letter
				switch (character) {
					case 'A': countA ++; break;
					case 'E': countE ++; break;
					case 'I': countI ++; break;
					case 'O': countO ++; break;
					case 'U': countU ++; break;
					case 'Y': countY ++; break;
					case 'a': counta ++; break;
					case 'e': counte ++; break;
					case 'i': counti ++; break;
					case 'o': counto ++; break;
					case 'u': countu ++; break;
					case 'y': county ++; break;
					
				}
			}
		}
		
		int sum = countA + countE + countI + countO + countU + countY + counta + counte + counti + counto + countu + county;
				 
		
		//Print the results
				System.out.println("Frequency of A chars: " + countA );
				System.out.println("Frequency of E chars: " + countE );
				System.out.println("Frequency of I chars: " + countI );
				System.out.println("Frequency of O chars: " + countO );
				System.out.println("Frequency of U chars: " + countU );
				System.out.println("Frequency of Y chars: " + countY );
				System.out.println("Frequency of a chars: " + counta );
				System.out.println("Frequency of e chars: " + counte );
				System.out.println("Frequency of i chars: " + counti );
				System.out.println("Frequency of o chars: " + counto );
				System.out.println("Frequency of u chars: " + countu );
				System.out.println("Frequency of y chars: " + county );
				
				System.out.println("---------------------------------------------------------------------------------------------------------");
				
				System.out.println("Total Characters: " + totalCharacters );
				System.out.println("Vowels: " + sum );
				
				System.out.println("Vowel percentage: " + ((double)sum/totalCharacters * 100) + "%" );

	}

}
