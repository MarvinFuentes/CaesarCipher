/**
 * @Class: Main
 * @Aurthor: Marvin Fuentes
 * @Course: ITEC 2140 Section 4
 * @Written: April 25, 2023
 * This class is called the main class since it contains the main method that will
 * create an instance to call the CaesarCipher Class and the user will also determine
 * which method will be invoked depending on their result. The program will also ask
 * the user to enter an integer which is technically the key to the cipher and will be
 * also used in the CaesarCipher class. Finally, the program will prompt the user with
 * the encrypted message or the decrypted message.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter their encrypted message or message they want to encrypt.
        System.out.print("Enter a message to be encrypted or decrypted: ");
        String message = scanner.nextLine();
        //The program then displays the message for user to enter the key integer value.
        System.out.print("Enter an integer key value for encryption or decryption: ");
        int integer = scanner.nextInt();
        //Right here I create an instance for the CaesarCipher Class.
        CaesarCipher cipher = new CaesarCipher(integer);
        //The program will now ask the user if they want to encrypt or decrypt the message.
        System.out.print("Enter 'E' to encrypt or 'D' to decrypt: ");
        String encryptOrDecrypt = scanner.next();
        //Based of the integer the user inputs the class will call the decrypt or encrypt method.
        String answer = "";
        if (encryptOrDecrypt.equalsIgnoreCase("e")) {
            answer = cipher.encrypt(message);
        } else if (encryptOrDecrypt.equalsIgnoreCase("d")) {
            answer = cipher.decrypt(message);
        }
        else {
            //This is just in case the user enters a letter or number that isn't e or d.
            System.out.println("Invalid input. Please enter 'e' or 'd'.");
            return;
        }
        //Now the program will display the encrypted or decrypted message.
        System.out.println("Decrypted or Encrypted message: " + answer);
    }
}

