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

package org.ujar.beginner.derek_banas.learn.java_basics.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Generics {

  // ---- GENERICS ----
  // Generics allow you to use any object type
  // Generic methods and classes can work with
  // any type automatically
  public void run() {
    System.out.printf("\n### %s\n", Generics.class.getSimpleName());
    String[] gA1 = {"one", "two"};
    printStuff(gA1);
    Integer[] gA2 = {1, 2, 3, 4};
    printStuff(gA2);

    // Using a wildcard to print any type of
    // collection
    ArrayList<Integer> aL1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    printAL(aL1);

    // Using a generic custom class
    MyGeneric<Integer> myGI = new MyGeneric<Integer>();
    myGI.setVal(10);
    System.out.println(myGI.getVal());
    MyGeneric<String> myGS = new MyGeneric<String>();
    myGS.setVal("Dog");
    System.out.println(myGS.getVal());
  }

  // ---- GENERIC METHODS ----
  // You define the type using angle brackets
  // and an uppercase letter
  private <E> void printStuff(E[] arr) {
    for (E x : arr) {
      System.out.println(x);
    }
  }

  // Use the wildcard ? when working with collections
  // You can define that you only want to accept
  // objects that subclass a class using
  // ArrayList<? extends YourClass>
  private void printAL(ArrayList<?> aL) {
    for (Object x : aL) {
      System.out.println(x);
    }
  }
}

//---- GENERIC CLASS ----
class MyGeneric<T> {
  private T val;

  public T getVal() {
    return val;
  }

  public void setVal(T val) {
    this.val = val;
  }
}
