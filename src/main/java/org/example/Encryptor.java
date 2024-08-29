package org.example;

public class Encryptor {
    private AlphabetHelper mapping;

    public Encryptor(AlphabetHelper mapping) {
        this.mapping = mapping;
    }

    // method to encrypt

    public String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();

        // iterate over each character

        for (char ch : message.toCharArray()) {
            // use mapping to covert character
            encryptedMessage.append(mapping.getEncryptedCharacter(ch));
        }

        return encryptedMessage.toString();
    }
}