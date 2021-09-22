/*
 *     Copyright 2021 uJar Boot Camp @ http://ujar.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ujar.beginner.derek_banas.learn.java_basics.looping;

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
