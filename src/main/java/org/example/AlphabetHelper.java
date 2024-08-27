package org.example;

// manage the alphabet and provide utilities to support the encoding/ decoding process
public class AlphabetHelper {
    public char getShiftedCharacter(char letter, int shift) {
        // convert letter to lowercase
        char lowerCaseLetter = Character.toLowerCase(letter);

        if (Character.isLetter(lowerCaseLetter)) {
            // calc new position after shift
            int newPosition = (lowerCaseLetter - 'a' + shift + 26) % 26;

            // convert new position back to letter
            char shiftedLetter = (char) ('a' + newPosition);

            // convert back to uppercase if it was before

            if (Character.isUpperCase(letter)) {
                return Character.toUpperCase(shiftedLetter);
        }

            return shiftedLetter;


        }

        return letter;

    }

}
