package best.dima.sandbox.languagebasics.print;

public class Print {

    public void run() {

        System.out.printf("\n### %s\n", Print.class.getSimpleName());
        // Let's print a huge smiley face!

        // println is a method (function) that
        // prints the provided string to the
        // console
        // All statements end with a ;
        // Java is case sensitive
        // print does the same without a newline
        System.out.println("XXXXXXXXXXX");
        System.out.println("X  _   _  X");
        System.out.println("X  0   0  X");
        System.out.println("X    ^    X");
        System.out.println("X  \\___/  X"); // "\" is the escape character
        System.out.println("X         X");
        System.out.println("XXXXXXXXXXX");
    }
}
