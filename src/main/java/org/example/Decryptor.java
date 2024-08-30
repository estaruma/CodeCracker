package org.example;

public class Decryptor {
    private AlphabetHelper mapping;

    public Decryptor(AlphabetHelper mapping) {
        this.mapping = mapping;
    }

    public String decrypt(String message) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (char ch : message.toCharArray()) {
            String symbol = String.valueOf(ch);
            char decryptedChar = mapping.getDecryptedCharacter(symbol);
            if (decryptedChar != '\0') {
                decryptedMessage.append(decryptedChar);
            } else {
                decryptedMessage.append(symbol);
            }
        }

        return decryptedMessage.toString();
    }
}