package org.example;

// Ensure the input data is valid before encoding or decoding
public class CipherValidator {
    public boolean isValidMessage(String message) {
        // check each character
        for (char ch : message.toCharArray()) {
            if(!isValidCharacter(ch)) {
                return false;
            }
        }
        return true;
    }


    // checlk if character is valid

    private boolean isValidCharacter(char ch) {
        if (Character.isLetterOrDigit(ch)) {
            return true;
        }

        // list of allowed symbols
        char[] allowedSymbols = {'!', ')', '(', '£', '*', '%', '&', '>', '<', '@'};

        for (char symbol : allowedSymbols) {
            if(ch == symbol) {
                return true;
            }
        }
        return false;
    }
}
