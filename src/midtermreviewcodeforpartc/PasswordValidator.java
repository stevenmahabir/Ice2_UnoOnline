/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class PasswordValidator {

    public static String getValidPassword(Scanner scan) {
        boolean validPassword = false;
        String password = "";

        while (!validPassword) {
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:");

            password = scan.nextLine();
            int specialCharCount = 0;

            //iterate over each character to see if it is a special character
            for (int i = 0; i < password.length(); i++) {
                if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if (specialCharCount > 0 && password.length() > 7) {
                validPassword = true;
            }
        }//loop only ends when password is valid so now we create the User
        return password;
    }
}
