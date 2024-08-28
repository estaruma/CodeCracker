package org.example;

// decoding and coding messages
public class CodeCracker {

    // use decryption key
    private final char[] decryptionKey;

    public CodeCracker(char[] decrytionKey) {
        this.decryptionKey = decrytionKey;
    }

    // to encode message
    public String encodeMessage (String message) {
        StringBuilder encodedMessage = new StringBuilder();

        for (char letter : message.toCharArray()) {
            //get position of letter
            int position = Character.toLowerCase(letter) - 'a';

            // find encoded character using decrytion key
            char encodedChar = decryptionKey[position];


            // check if original letter was uppercase

            if (Character.isUpperCase(letter)) {
                encodedMessage.append(Character.toUpperCase(encodedChar));
            } else {
                encodedMessage.append(encodedChar);
            }
        }
        return encodedMessage.toString();

    }


    // to decode message

    public String decodeMessage(String message) {
        StringBuilder decodedMessage = new StringBuilder();

        for (char letter : message.toCharArray()) {
            if (isDecryptionCharacter(Character.toLowerCase(letter))) {
                // find position
                int position = findDecryptionPosition(Character.toLowerCase(letter));
                // convert the position back to a letter
                char decodedChar = (char) ('a' + position);

                // if original was uppercase
                if (Character.isUpperCase(letter)) {
                    decodedMessage.append(Character.toUpperCase(decodedChar));
                } else {
                    decodedMessage.append(decodedChar);
                }
            } else {
                decodedMessage.append(letter);
            }
        }
        return decodedMessage.toString();
    }

    // check if char is in description key
    private boolean isDecryptionCharacter(char character) {
        for (char keyChar : decryptionKey) {
            if (keyChar == character) {
                return true;
            }
        }
        return false;
    }


    // method to find posiitons of a character
    private int findDecryptionPosition(char letter) {
        for (int i = 0; i < decryptionKey.length; i++) {
            if (decryptionKey[i] == letter) {
                return i;
            }
        }
        throw new IllegalArgumentException(String.valueOf(letter));

    }
}




