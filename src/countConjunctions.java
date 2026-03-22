/*
* Student Name: Andrew Mugisa
* Lab Professor: James
* Due Date: 2026-03-22
* Modified: 2026-03-22
* Purpose: To analyze a text for conjunction usage, sentence structure, and readability.
*/
public class countConjunctions {
	static public void countMethod(String sentence) {
		System.out.println("---------------------------------------------------------------------------------------------------------");

//initial counts of each vowel
		int countAnd = 0;
		int countThat = 0;
		int countBut = 0;
		int countOr = 0;
		int countAs = 0;
		int countIf = 0;
		int countWhen = 0;
		int countThan = 0;
		int countBecause = 0;
		int countWhile = 0;
		
		
		sentence = sentence.toLowerCase();
		String longestWord = "";
		//int sentenceCount = 0;
		
        // split sentence into words
        String[] words = sentence.split("\\W+");
		
        int maxLength = 0;
			
        for (String word : words) {
			switch (word) {
				case "and": countAnd++; break;
	            case "that": countThat++; break;
	            case "but": countBut++; break;
	            case "or": countOr++; break;
	            case "as": countAs++; break;
	            case "if": countIf++; break;
	            case "when": countWhen++; break;
	            case "than": countThan++; break;
	            case "because": countBecause++; break;
	            case "while": countWhile++; break;            
			}
			
			
			//find longest word
            if (word.length() > maxLength) {
            	maxLength = word.length();
            	longestWord = word;
            }

		}
        
        
        //find number of sentences
        String[] sentences  = sentence.split("\\.");
        
		/*for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (c == '.') {
				sentenceCount ++;
			}
		} */
        int numOfWordsInSentence = 0;
        double averageWordsInSentence = 0;
        //count words in each sentence
        for (int i = 0; i < sentences.length; i++) {
        	String[] eachSentence = sentences[i].split("\\W+");
        	
        	numOfWordsInSentence = eachSentence.length;
        	
        	System.out.println("number Of Words In Sentence: " + numOfWordsInSentence);
        	
    	//
        	averageWordsInSentence = ((double)numOfWordsInSentence/sentences.length);
    	
    	if(averageWordsInSentence <= 13) {
    		System.out.println("4th Grade");
    	}else if (averageWordsInSentence <= 16) {
    		System.out.println("8th Grade");
    	}else if (averageWordsInSentence == 17) {
    		System.out.println("12th Grade");
    	}else {
    		System.out.println("Adult");
    	}
    	
    	System.out.println("Average" + averageWordsInSentence);
        	
        }
        
		System.out.println("---------------------------------------------------------------------------------------------------------");


        
       // System.out.println("===" + sentences[1]);
        
        System.out.println("longest Word is: " + longestWord);
        
        System.out.println("Number of sentences: " + sentences.length);
        
		System.out.println("---------------------------------------------------------------------------------------------------------");

		//Print the results
		System.out.println("Frequency for And: " + countAnd);
		System.out.println("Frequency for That: " + countThat);
		System.out.println("Frequency for But: " + countBut);
		System.out.println("Frequency for Or: " + countOr);
		System.out.println("Frequency for As: " + countAs);
		System.out.println("Frequency for If: " + countIf);
		System.out.println("Frequency for When: " + countWhen);
		System.out.println("Frequency for Than: " + countThan);
		System.out.println("Frequency for Because: " + countBecause);
		System.out.println("Frequency for While: " + countWhile);
		
		System.out.println("---------------------------------------------------------------------------------------------------------");

    	//System.out.println("Number of sentences: " + sentenceCount);
    	
    	

	}

}

