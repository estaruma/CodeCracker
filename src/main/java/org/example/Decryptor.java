package org.example;

public class Decryptor {
    private AlphabetHelper mapping;

    public Decryptor(AlphabetHelper mapping) {
        this.mapping = mapping;
    }

    // method to decrypt

    public String decrypt(String message) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            String symbol = String.valueOf(message.charAt(i));
            decryptedMessage.append(mapping.getDecryptedCharacter(symbol));
        }

        return decryptedMessage.toString();
    }
}