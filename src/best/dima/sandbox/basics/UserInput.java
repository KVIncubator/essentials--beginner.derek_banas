package best.dima.sandbox.basics;

import java.util.*;

public class UserInput {
    // make new object of class Scanner, based on System.in and call it input
    static private Scanner input = new Scanner(System.in);

    // Constructor
    public void UserInput() {
        // ---- VARIABLES ----
        // Must start with a letter and then
        // letters, numbers, _ or $

        // Create a variable for holding whole numbers
        int var1 = 100;

        // Create multiple variables
        int v2, v3;
    }

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        // Read user input
        String yourName = input.nextLine();
        System.out.printf("Hello, %s!!!!!%s", yourName, "\n"); // say hello
    }
}