package best.dima.sandbox.lang.basics.conditionals;

public class Conditionals {

    // ---- CONDITIONALS ----
    // Relational Operators : == != > < >= <=
    // Logical Operators : ! && ||
    public void run() {
        System.out.printf("\n### %s\n", Conditionals.class.getSimpleName());

        int age = 12;
        if ((age >= 5) && (age <= 6)){
            System.out.println("Go to Kindergarten");
        } else if ((age >= 7) && (age <= 13)){
            System.out.println("Go to Middle School");
        } else if ((age >= 14) && (age <= 18)){
            System.out.println("Go to High School");
        } else {
            System.out.println("Stay Home");
        }

        System.out.println("true || false = "+(true || false));
        System.out.println("!true = "+(!true));

        // The ternary operator returns the 1st value
        // when the condition is true and the 2nd
        // otherwise
        boolean canVote = (age >= 18) ? true : false;
        System.out.println("Can Vote : "+canVote);

        // Switch is used when you have limited options
        String lang = "France";
        switch(lang) {
            case "Chile": case "Cuba":
                System.out.println("Hola");

                // Without break the next condition
                // is checked
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Japan":
                System.out.println("Konnichiwa");
                break;
            default:
                System.out.println("Hello");
        }
    }
}
