package org.example;

public class Encryptor {
    private AlphabetHelper mapping;

    public Encryptor(AlphabetHelper mapping) {
        this.mapping = mapping;
    }

    // method to encrypt
    public String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();

        //iterate over each character in the message
        for (char ch : message.toCharArray()) {
            // encrypted char from mapping
            String encryptedChar = mapping.getEncryptedCharacter(ch);
            //Append the encrypted character if it exists, otherwise append the original character
            if (encryptedChar != null) {
                encryptedMessage.append(encryptedChar);
            } else {
                encryptedMessage.append(ch);
            }
        }
        //encrypted message
        return encryptedMessage.toString();
    }
}