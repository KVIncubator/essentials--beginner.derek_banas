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

package org.ujar.beginner.derek_banas.learn.java_basics.print;

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
