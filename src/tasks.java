/*
* Student Name: Andrew Mugisa
* Lab Professor: James
* Due Date: 2026-03-22
* Modified: 2026-03-22
* Description: This is the main method that initiates the other class methods.
*/
public class tasks {
    public static void main(String[] args) {
        //---------------We shall take a sentence and count vowels in it---------------\\
        
        // The sentence being analyzed
        String sentence = "It is  a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife. "
                + "However little known the feelings of such a man may be on his first entering a neighbourhood, this truth is so well fixed in the minds of the surrounding families."
                + "That he is considered the rightful property of someone or other of their daughters.";
        
        // Count vowels in the sentence
        countVowels.countMethod(sentence);
        
        // Count conjunctions in the sentence
        countConjunctions.countMethod(sentence);
    }
}