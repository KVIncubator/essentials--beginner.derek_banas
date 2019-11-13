package best.dima.sandbox.basics;

import best.dima.sandbox.basics.print.Printer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize property
        Printer printer = new Printer();
        // make new object of class Scanner, based on System.in and call it input
        Scanner input = new Scanner(System.in);

        // use only fully qualified names
        best.dima.sandbox.basics.helloworld.Main.main(args);

        System.out.print("Enter your name ==> ");
        // Read user input
        String yourName = input.nextLine();
        System.out.printf("Hello, %s!!!!!\n", yourName); // say hello

    }
}
