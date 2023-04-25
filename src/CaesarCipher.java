/**
 * @Class: CeaserCipher
 * @Aurthor: Marvin Fuentes
 * @Course: ITEC 2140 Section 4
 * @Written: April 25, 2023
 * This class does not contain a main method since all I need this class to do is
 * identify the integer the user will want to use in the main method and determine how
 * much to shift the alphabet. The user will determine if they want to use to encrypt
 * or decrypt method to further more encrypt a message or decrypt it. The for loop begins
 * by declaring a String variable as a placeholder and the for loop will use the index
 * from the input message to shift it in the alphabet then return the result.
 */
class CaesarCipher {
    private int integer;
    //This is the constructor
    public CaesarCipher(int integer) {
        this.integer = integer;
    }
    //If the user prompts the program to encrypt then this method will be invoked.
    public String encrypt(String message) {
        String encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                char shift = (char) (c + integer);
                if (Character.isUpperCase(c) && shift > 'Z') {
                    shift = (char) (shift - 26);
                } else if (Character.isLowerCase(c) && shift > 'z') {
                    shift = (char) (shift - 26);
                }
                encrypted = encrypted + shift;
            } else {
                encrypted = encrypted + c;
            }
        }
        return encrypted;
    }
    //If the user prompts the program to decrypt then this method will be invoked.
    public String decrypt(String message) {
        String decrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                char shift = (char) (c - integer);
                if (Character.isUpperCase(c) && shift < 'A') {
                    shift = (char) (shift + 26);
                } else if (Character.isLowerCase(c) && shift < 'a') {
                    shift = (char) (shift + 26);
                }
                decrypted = decrypted + shift;
            } else {
                decrypted = decrypted + c;
            }
        }
        return decrypted;
    }
}