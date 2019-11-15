package best.dima.sandbox.basics;

import best.dima.sandbox.basics.conditionals.Conditionals;
import best.dima.sandbox.basics.datatypes.DataTypes;
import best.dima.sandbox.basics.exceptionhandling.ExceptionHandling;
import best.dima.sandbox.basics.files.Files;
import best.dima.sandbox.basics.generics.Generics;
import best.dima.sandbox.basics.lambdaexpressions.LambdaExpressions;
import best.dima.sandbox.basics.looping.Looping;
import best.dima.sandbox.basics.mathematics.Mathematics;
import best.dima.sandbox.basics.print.Print;
import best.dima.sandbox.basics.regularexpressions.RegularExpressions;
import best.dima.sandbox.basics.streams.Streams;
import best.dima.sandbox.basics.strings.Strings;
import best.dima.sandbox.basics.arrays.ArraysData;
import best.dima.sandbox.basics.threads.Threads;

public class Main {

    // This is a constant that value can't change
    final double SHORTPI = 3.14159;

    // ---- ENUMERATED TYPES ----
    // Custom type with limited number of options
    // Must be declared at top of class
    private enum Day {Monday,Tuesday,Wednesday};

    // static means that this object belongs
    // to the class (More Later)
    static private Print printing = new Print();
    static private DataTypes dataTypes = new DataTypes();
    static private Mathematics mathematics = new Mathematics();
    static private Strings strings = new Strings();
    static private ArraysData arrays = new ArraysData();
    static private Conditionals conditionals = new Conditionals();
    static private Looping looping = new Looping();
    static private Streams streams = new Streams();
    static private RegularExpressions regex = new RegularExpressions();
    static private LambdaExpressions lambdas = new LambdaExpressions();
    static private Files files = new Files();
    static private Generics generics = new Generics();
    static private Threads threads = new Threads();
    static private ExceptionHandling exceptions = new ExceptionHandling();


    // ---- MAIN FUNCTION ----

    // Code in main is where execution begins
    // static means this is a class function
    // versus an object function (More later)
    // void states that this code does not return
    // a value during execution
    // Any data passed to your program from the
    // terminal or command line is stored in args
    public static void main(String[] args) {
        // Hello, World! You can use fully-qualified names
        best.dima.sandbox.basics.helloworld.HelloWorld.main(args);
        // Print functions
        printing.run();
        // Data types
        dataTypes.run();
        // Math
        mathematics.run();
        // Strings
        strings.run();
        // Arrays
        arrays.run();
        // Conditionals
        conditionals.run();
        // Looping
        looping.run();
        // Streams
        streams.run();
        // Regular Expressions
        regex.run();
        // Lambdas
        lambdas.run();
        // Files
        files.run();
        // Generics
        generics.run();
        // Threads
        threads.run();
        // Exceptions
        exceptions.run();
    }
}