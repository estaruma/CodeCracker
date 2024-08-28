package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] decryptionKey = {'!', ')', '"', '(', '£', '*', '%', '&', '>', '<', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'};

        CodeCracker codeCracker = new CodeCracker(decryptionKey);
        CipherValidator cipherValidator = new CipherValidator();

        String message = "Hello World!";
        if (cipherValidator.isValidMessage(message)) {

            String encoded = codeCracker.encodeMessage(message);
            System.out.println(encoded);

            String decoded = codeCracker.decodeMessage(encoded);
            System.out.println(decoded);
        } else {
            System.out.println("Invalid message");
        }


    }
}