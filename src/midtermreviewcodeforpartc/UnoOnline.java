/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 * The signIn page for UnoOnline. Takes in a user name and password and then
 * validates the password before creating a new user in the list of possible
 * users. To be used as the beginning code for MidtermReview C.
 *
 * @author dancye, 2019
 * @author Steve, 2025
 */
public class UnoOnline {

    private User users[] = new User[100];//room for 100 online players!

    /**
     * Main method with call to private run method, to encapsulate our main
     * functionality.
     *
     * @param args - not used
     */
    public static void main(String[] args) {
        UnoOnline newPortal = new UnoOnline();
        newPortal.run();
    }

    /**
     * method that takes in the User's name and chosen password and then
     * continues prompting until the password is valid based on the following
     * two rules: 1. The password must be at least length 8 2. The password must
     * contain at least one "special character"
     *
     */
    private void run() {
        int userCount = 0;//keep track of number of users for array
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your desired user name:");
        String userName = scan.nextLine();

        String password = PasswordValidator.getValidPassword(scan);

        User newUser = new User(userName, password);
        users[userCount] = newUser;//add the new user to the user list
        userCount++;

        System.out.println("New User Added");
        System.out.println("UserName: " + userName);
        System.out.println("Password: just kidding can't show password");
    }//end run method

}//end class
