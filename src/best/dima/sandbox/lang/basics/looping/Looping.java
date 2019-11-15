package best.dima.sandbox.lang.basics.looping;

public class Looping {

    public  void run() {
        System.out.printf("\n### %s\n", Looping.class.getSimpleName());
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // while loops as long as a condition is true
        int wI = 0;
        while (wI < 20) {

            // Only print even numbers
            if(wI % 2 == 0) {
                System.out.println(wI);
                wI++;
                // Jump back to the beginning of loop
                continue;
            }
            if(wI >= 10) {
                // Stop looping
                break;
            }
            wI++;
        }

        /**
        // Do whiles execute at least once
        int secretNum = 7;
        int guess = 0;
        do {
            System.out.println("Guess : ");
            if(sc.hasNextInt()){
                guess = sc.nextInt();
            }
        }while(secretNum != guess);
        System.out.println("You guessed it");
        */
    }
}
