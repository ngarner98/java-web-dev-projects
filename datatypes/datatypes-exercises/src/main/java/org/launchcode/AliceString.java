package org.launchcode;

import java.util.Scanner;

public class AliceString {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, but " +
                "it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";
        quote = quote.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for? ");
        String term = (input.nextLine()).toLowerCase();
        System.out.println(term);
        boolean hasTerm = quote.contains(term);
        System.out.println("Does this quote contain " + term + "? Result is: "  + hasTerm);

        //PART E
        Integer index = quote.indexOf(term);
        Integer length = term.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedQuote = quote.replace(term, "");
        System.out.println(modifiedQuote);
    }


}
