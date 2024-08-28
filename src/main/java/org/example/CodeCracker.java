package org.example;

// decoding and coding messages
public class CodeCracker {

    // use decryption key
    private final char[] decrytionKey;

    public CodeCracker(char[] decrytionKey) {
        this.decrytionKey = decrytionKey;
    }

    // to encode message
    public String encodeMessage (String message) {
        StringBuilder encodedMessage = new StringBuilder();

        for (char letter : message.toCharArray()) {
            //get position of letter
            int position = Character.toLowerCase(letter) - 'a';

            // find encoded character using decrytion key
            char encodedChar = decrytionKey[position];


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

}
