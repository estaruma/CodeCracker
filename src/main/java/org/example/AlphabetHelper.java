package org.example;

// manage the alphabet and provide utilities to support the encoding/ decoding process
import java.util.HashMap;
import java.util.Map;

public class AlphabetHelper {

    // map to store encrypting and decrypting
    // alphabet character to symbol
    private Map<Character, String> encryptionMap;
    // symbol to alphabet character
    private Map<String, Character> decryptionMap;


    // constructor
    public AlphabetHelper(String alphabet, String[] decryptionKey) {
        encryptionMap = new HashMap<>();
        decryptionMap = new HashMap<>();

        // for loop populate maps

        for (int i = 0; i < alphabet.length(); i++) {
            // map character to symbol
            encryptionMap.put(alphabet.charAt(i), decryptionKey[i]);
            // map symbol to character
            decryptionMap.put(decryptionKey[i], alphabet.charAt(i));
        }
    }

    public String getEncryptedCharacter(char ch) {
        return encryptionMap.getOrDefault(ch, String.valueOf(ch));
    }

    public char getDecryptedCharacter(String symbol) {
        return decryptionMap.getOrDefault(symbol, symbol.charAt(0));
    }
}
