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

package org.ujar.beginner.derek_banas.learn.java_basics.mathematics;

public class Mathematics {

  public void run() {
    System.out.printf("\n### %s\n", Mathematics.class.getSimpleName());

    System.out.println("5 + 4 = " + (5 + 4));
    System.out.println("5 - 4 = " + (5 - 4));
    System.out.println("5 * 4 = " + (5 * 4));
    System.out.println("5 / 4 = " + (5 / 4));
    System.out.println("5 % 4 = " + (5 % 4));

    // Math done on integers default to
    // integer output and doubles return doubles
    System.out.println("5 / 4 = " + (5.0 / 4.0));

    // incMe++ same as incMe = incMe + 1
    // Can also decrement with --
    int incMe = 0;
    System.out.println("incMe: " + (incMe++));
    System.out.println("incMe: " + (++incMe));

    // incMe = incMe + 10 == incMe += 10
    // Same with -= *= /= %=
    incMe += 10;

    // Numerous math functions
    System.out.println("abs(-1) = " + Math.abs(-1));
    System.out.println("ceil(4.25) = " + Math.ceil(4.25));
    System.out.println("floor(4.25) = " + Math.floor(4.25));
    System.out.println("round(4.25) = " + Math.round(4.25));
    System.out.println("max(4,5) = " + Math.max(4, 5));
    System.out.println("min(4,5) = " + Math.min(4, 5));
    System.out.println("exp(1) = " + Math.exp(1));
    System.out.println("log(1) = " + Math.log(1));
    System.out.println("log10(1) = " + Math.log10(1));
    System.out.println("pow(2,2) = " + Math.pow(2, 2));
    System.out.println("sqrt(4) = " + Math.sqrt(4));
    System.out.println("cbrt(4) = " + Math.cbrt(4));
    System.out.println("hypot(5,5) = " + Math.hypot(5, 5));
    System.out.println("PI = " + Math.PI);

    // Trig Functions Radians
    System.out.println("sin(1.5708) = " + Math.sin(1.5708));
    System.out.println("cos(1.5708) = " + Math.cos(1.5708));
    System.out.println("tan(1.5708) = " + Math.tan(1.5708));
    System.out.println("asin(1.5708) = " + Math.asin(1.5708));
    System.out.println("acos(1.5708) = " + Math.acos(1.5708));
    System.out.println("atan(1.5708) = " + Math.atan(1.5708));
    System.out.println("sinh(1.5708) = " + Math.sinh(1.5708));
    System.out.println("cosh(1.5708) = " + Math.cosh(1.5708));
    System.out.println("tanh(1.5708) = " + Math.tanh(1.5708));
    System.out.println("toDegrees(1.5708) = " + Math.toDegrees(1.5708));
    System.out.println("toRadians(90) = " + Math.toRadians(90));

    // Random number between 5 and 20
    int minNum = 5;
    int maxNum = 20;
    int randNum = minNum + (int) (Math.random() *
                                  ((maxNum - minNum) + 1));
    System.out.println("Rand : " + randNum);
  }
}
