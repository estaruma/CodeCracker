package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EcryptionTest {

    @Test
    public void testAlphabetHelper() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz !";
        String[] decryptionKey = {"!", ")", "\"", "(", "£", "*", "%", "&", ">", "<", "@", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "~", "?"};
        AlphabetHelper mapping = new AlphabetHelper(alphabet, decryptionKey);

        // Test encryption map
        assertEquals("!", mapping.getEncryptedCharacter('a'));
        assertEquals(")", mapping.getEncryptedCharacter('b'));
        assertEquals("<", mapping.getEncryptedCharacter('j'));
        assertEquals("?", mapping.getEncryptedCharacter('!'));

        // Test decryption map
        assertEquals('a', mapping.getDecryptedCharacter("!"));
        assertEquals('b', mapping.getDecryptedCharacter(")"));
        assertEquals('j', mapping.getDecryptedCharacter("<"));
        assertEquals('!', mapping.getDecryptedCharacter("?"));
    }

    @Test
    public void testEncryptor() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz !";
        String[] decryptionKey = {"!", ")", "\"", "(", "*", "£", "%", "&", ">", "<", "@", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "~", "?"};
        AlphabetHelper mapping = new AlphabetHelper(alphabet, decryptionKey);
        Encryptor encryptor = new Encryptor(mapping);

        // Test encryption
        assertEquals("(", encryptor.encrypt("d"));
        assertEquals(")!£*", encryptor.encrypt("bafe"));
        assertEquals(")~!", encryptor.encrypt("b a"));
        assertEquals("!<@a", encryptor.encrypt("ajkl"));
        assertEquals("?)~", encryptor.encrypt("!b "));
    }

    @Test
    public void testEncryptionDecryption() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz !";
        String[] decryptionKey = {"!", ")", "\"", "(", "£", "*", "%", "&", ">", "<", "@", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "~", "!"};

        AlphabetHelper mapping = new AlphabetHelper(alphabet, decryptionKey);
        Encryptor encryptor = new Encryptor(mapping);
        Decryptor decryptor = new Decryptor(mapping);

        String originalMessage = "hello world!";
        String encryptedMessage = encryptor.encrypt(originalMessage);
        String decryptedMessage = decryptor.decrypt(encryptedMessage);

        // Test encryption and decryption together
        assertEquals(originalMessage, decryptedMessage);
    }
}
