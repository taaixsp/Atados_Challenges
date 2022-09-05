/*Construa um algoritmo que recebe como entrada uma palavra e retorna qual a letra que
mais se repete dentro dela.
Exemplo:
Entrada: “Ararara”
Saída: a: 4 */



package challenge2;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in); //creating a scanner object to read input
        
        System.out.println("Type your word: ");  //asking for word
        String word = input.next(); //input
        
        char mostRepeated = charMostRepeated(word); //defining type to get most repeated character      
        System.out.println("The character that has repeated the most is: " + mostRepeated + "."); // output with concatenation
        
        System.out.println("It has repeated " + counts_occurrencies(mostRepeated, word) + " times.");

        input.close();
    }

    public static char charMostRepeated(String string) { //method to receive and count most repeated character
        int characters[] = new int[256];                 //256 convention
        int length = string.length();                     //checks the size of word
        char mostRepeated = ' ';                          //keeps most repeated character
        int biggerIndex = -1;                              //index from most repeated character

        for (int i = 0; i < length; i++) {                //going through characters from given word
            characters[string.charAt(i)]++;                  //incrementing value
        }

        for (int i = 0; i < length; i++) {                //getting most repeated character
            if (biggerIndex < characters[string.charAt(i)]) {
                biggerIndex = characters[string.charAt(i)];
                mostRepeated = string.charAt(i);
            }
        }
        return mostRepeated;
    }

    public static int counts_occurrencies(char character, String string) {   //keeps how many times the word appears
        
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }
}