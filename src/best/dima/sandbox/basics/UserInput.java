package best.dima.sandbox.basics;

import javax.swing.*;
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

    // ---- USER INPUT ----
    // The Scanner object receives user input
    // using nextShort, nextByte, nextBoolean,
    // nextInt, nextFloat, nextDouble,
    // nextLong, nextLine
    public static void main(String[] args) {
        System.out.print("Enter name: ");

        // Did the user enter a string
        // Use hasNextDataType to check if a
        // valid type was entered
        if(input.hasNextLine()){
            String userName = input.nextLine();
            System.out.println("Hello "+userName);
        }

        // Get input using a dialog box
        String jopName =
                JOptionPane.showInputDialog("Enter Name");
        System.out.println("Hello "+jopName);
    }
}