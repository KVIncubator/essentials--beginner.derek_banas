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

package org.ujar.beginner.derek_banas.learn.java_basics.datatypes;

public class DataTypes {

    // ---- DATA TYPES ----
    // Java requires every variable to have
    // a defined data type
    // Primitive Types
    // byte, short, char, boolean, int, float,
    // double, and long
    public void run() {
        System.out.printf("\n### %s\n", DataTypes.class.getSimpleName());
        this.list();
        this.casting();
    }

    private void list()
    {
        // Wrapper classes make primitive types
        // act like objects
        System.out.println("Byte Max: " +
                Byte.MAX_VALUE);
        System.out.println("Byte Min: " +
                Byte.MIN_VALUE);
        System.out.println("Short Max: " +
                Short.MAX_VALUE);
        System.out.println("Short Min: " +
                Short.MIN_VALUE);
        System.out.println("Char Max: " +
                (Character.MAX_VALUE+0));
        System.out.println("Char Min: " +
                (Character.MIN_VALUE+0));
        System.out.println("Int Max: " +
                Integer.MAX_VALUE);
        System.out.println("Int Min: " +
                Integer.MIN_VALUE);
        System.out.println("Float Max: " +
                Float.MAX_VALUE);
        System.out.println("Float Min: " +
                Float.MIN_VALUE);
        System.out.println("Double Max: " +
                Double.MAX_VALUE);
        System.out.println("Double Min: " +
                Double.MIN_VALUE);
        System.out.println("Long Max: " +
                Long.MAX_VALUE);
        System.out.println("Long Min: " +
                Long.MIN_VALUE);

        // Booleans are either true or false
        // You can't use 0 or anything else
        boolean happy = true;

        // Characters can only store single
        // characters (must use ')
        char a = 'a';

        // You can also store escaped characters
        // \n, \t, \b, \f, \r, \", \', \\

        // Floating point precision 6 decimals
        float fNum = 1.1111111111111111F;
        float fNum2 = 1.1111111111111111F;
        System.out.println("Float : " +
                (fNum + fNum2));

        // Double precision 15 decimals
        double dblNum = 1.1111111111111111;
        double dblNum2 = 1.1111111111111111;
        System.out.println("Float : " +
                (dblNum + dblNum2));

        // Can use scientific notation
        double thousand = 1e+3;
        System.out.println(thousand);

        // You can define longs with _
        long bigNum = 123_456_789;

    }

    // ---- CASTING ----
    private void casting()
    {
        // You can convert from smaller types
        // to larger types automatically
        int smInt = 10;
        long smLong = smInt;

        // Use (newType) otherwise
        double cDbl = 1.234;
        int cInt = (int) cDbl;
        System.out.println(cInt);

        long bigLong = 21474836470L;
        int bInt = (int) bigLong;
        System.out.println(bInt);

        // Use wrapper class to convert to string
        String favNum = Double.toString(1.618);

        // Convert Strings to primitives with
        // Byte.parseByte, Boolean.parseBoolean,
        // and the same format for each type
        // except for chars
        int strInt = Integer.parseInt("10");

    }
}
