package org.example;

public class Main {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz !";
        String[] decryptionKey = {"!", ")", "\"", "(", "£", "*", "%", "&", ">", "<", "@", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", " ", "!"};

        AlphabetHelper mapping = new AlphabetHelper(alphabet, decryptionKey);

        Encryptor encryptor = new Encryptor(mapping);
        Decryptor decryptor = new Decryptor(mapping);

        // Convert the message to lowercase
        String message = "Hello World!".toLowerCase();
        String encryptedMessage = encryptor.encrypt(message);
        String decryptedMessage = decryptor.decrypt(encryptedMessage);

        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + encryptedMessage);
        System.out.println("Decrypted: " + decryptedMessage);
    }
}