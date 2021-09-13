/*
 *     Copyright 2021 ujar Knowledge Base @ http://ujar.org
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

package org.ujar.learn.java_basics;

import org.ujar.learn.java_basics.annotations.UseCustomAnnotation;
import org.ujar.learn.java_basics.arrays.ArraysData;
import org.ujar.learn.java_basics.conditionals.Conditionals;
import org.ujar.learn.java_basics.files.Files;
import org.ujar.learn.java_basics.helloworld.HelloWorld;
import org.ujar.learn.java_basics.lambdaexpressions.LambdaExpressions;
import org.ujar.learn.java_basics.print.Print;
import org.ujar.learn.java_basics.regularexpressions.RegularExpressions;
import org.ujar.learn.java_basics.datatypes.DataTypes;
import org.ujar.learn.java_basics.exceptionhandling.ExceptionHandling;
import org.ujar.learn.java_basics.generics.Generics;
import org.ujar.learn.java_basics.looping.Looping;
import org.ujar.learn.java_basics.mathematics.Mathematics;
import org.ujar.learn.java_basics.streams.Streams;
import org.ujar.learn.java_basics.strings.Strings;
import org.ujar.learn.java_basics.threads.Threads;

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
        HelloWorld.main(args);
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
        // Exceptions
        exceptions.run();
        // Custom annotation reader
        UseCustomAnnotation.main(args);
        // Threads
        threads.run();

    }
}