package best.dima.sandbox.lang.basics.exceptionhandling;

public class ExceptionHandling {

    // ---- EXCEPTION HANDLING ----
    // Used to catch errors that could crash
    // our program
    public void run() {
        System.out.printf("\n### %s\n", ExceptionHandling.class.getSimpleName());

        // Surround problem code with a try block
        try {
            // int badInt = 10 / 0;

            // You can create your own exception
            // classes or just throw one without
            throw new Exception("Bad Stuff");
        }
        // Catch division by 0
        catch(ArithmeticException ex) {
            System.out.println("Can't divide by zero");
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        }
        // Catch any exception
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        // Executed whether exception occurred or not
        // Used to close files, DBs and other clean up
        finally {
            System.out.println("Clean Up");
        }
    }
}
