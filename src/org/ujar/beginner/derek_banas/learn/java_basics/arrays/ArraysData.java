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

package org.ujar.beginner.derek_banas.learn.java_basics.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class ArraysData {

    public void run() {
        System.out.printf("\n### %s\n", ArraysData.class.getSimpleName());
        this.arrays();
        this.arrayList();
        this.linkedList();
    }

    // ---- ARRAYS ----
    // Arrays are boxes in memory that hold
    // multiple values
    private void arrays() {
        System.out.println("-- arrays");

        // Create an array that can hold 10 values
        int[] a1 = new int[10];

        // Assign a value to the first index (address)
        a1[0] = 1;

        // Fill array with a value
        Arrays.fill(a1,2);

        // Get value
        System.out.println(a1[0]);

        // Get size
        System.out.println(a1.length);

        // Create and add values at the same time
        String[] a2 = {"one","two"};

        // Generate an array from 1 to 10 (More Later)
        int[] oneTo10 = IntStream.rangeClosed(1, 10).toArray();

        // The enhanced for loop
        for(int x: oneTo10) System.out.println(x);

        // Find value
        System.out.println(Arrays.binarySearch(oneTo10, 9));

        // Multidimensional array
        int a3[][] = new int[2][2];

        // Create and initialize
        // a4[How many down][How many across]
        String[][] a4 = {{"00", "10"},
                {"01", "11"}};

        System.out.println(a4[1][1]);

        // a5[How many down][How many across][How many Groups]
        // a5[3][4][1]
        String a5[][][] = {{{"000"}, {"100"}, {"200"}, {"300"}},
                {{"010"}, {"110"}, {"210"}, {"310"}},
                {{"020"}, {"120"}, {"220"}, {"320"}}};
        System.out.println(a5[2][3][0]);

        // Copy array into another
        int a6[] = {1,2,3};
        int a7[] = Arrays.copyOf(a6, 3);

        // Compare arrays
        System.out.println(Arrays.equals(a6, a7));

        // Sort array
        int a8[] = {3,2,1};
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8));
    }

    // ---- ARRAYLIST ----
    // ArrayLists resize and provide for easy
    // insertion and deletion
    private void arrayList()
    {
        System.out.println("-- ArrayList");
        // Create a String ArrayList with 20 spaces
        ArrayList<String> aL1 = new ArrayList<String>(20);

        // Add value
        aL1.add("Sue");

        // Generate an ArrayList
        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        for(Integer x: aL2) System.out.println(x);

        // Get a value
        System.out.println(aL2.get(1));

        // Add a value at index
        aL2.set(1, 5);

        // Delete value (Delete all aL2.clear())
        aL2.remove(3);

        // Iterators are used to cycles through
        // collections like ArrayLists
        Iterator it = aL2.iterator();

        // Loop while more values exist
        while(it.hasNext()) {
            // Output each value
            System.out.println(it.next());
        }
    }

    // ---- LINKEDLIST ----
    // Best when you have to make changes
    // in the middle of the list
    private void linkedList() {
        System.out.println("-- LinkedList");

        // Each link has a reference to the value
        // before and the value after
        LinkedList<Integer> lL1 = new LinkedList<Integer>();

        // Add value
        lL1.add(1); lL1.add(2); lL1.add(3);

        // Add array to list
        lL1.addAll(Arrays.asList(1,2,3,4));

        // Add to front (addLast Also)
        lL1.addFirst(0);

        // Check if in list
        System.out.println(lL1.contains(4));

        // Get index for match
        System.out.println(lL1.indexOf(4));

        // Replace
        lL1.set(0, 2);

        // Get value
        // Also getFirst, getLast
        System.out.println(lL1.get(0));

        // Delete (clear() removes all)
        lL1.remove(1);

        // Get size
        System.out.println(lL1.size());

        // Convert to array
        Object[] a9 = lL1.toArray();
    }
}
