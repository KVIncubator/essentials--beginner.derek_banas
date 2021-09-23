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

package org.ujar.beginner.derek_banas.learn.java_basics.strings;

public class Strings {

  // ---- STRINGS ----
  // Strings are objects (Reference Type)
  // They have built in methods and must
  // be surrounded with "
  public void run() {
    System.out.printf("\n### %s\n", Strings.class.getSimpleName());

    String name = "Derek";

    // Combine strings with +
    // or +=
    String wName = name + " Banas";
    wName += " is my name";

    // Conversion is automatic when using
    // primitives
    String drsDog = "K" + 9;

    // Get character at index
    System.out.println(wName.charAt(0));

    // Does it contain a Derek
    // startsWith, endsWith
    System.out.println(wName.contains("Derek"));

    // Get index of match
    System.out.println((wName.indexOf("Derek")));

    // Number of characters
    System.out.println(wName.length());

    // Don't use == to compare strings use equals
    // == would check if they point to the same
    // memory location
    // .equalsIgnoreCase ignores case
    String str1 = "dog";
    System.out.println("dog equals cat : " +
                       (str1.equals("cat")));

    // Compare strings 0 if same, -1 if string
    // comes before other or 1
    // compareToIgnoreCase
    System.out.println(wName.compareTo("ABC"));

    // Replace matches
    // replaceFirst
    System.out.println(wName.replace("Derek", "Bob"));

    // Get string at indexes
    System.out.println(wName.substring(0, 5));

    // Turn string into array
    // Shortcut for printing array (Enhanced For)
    // toCharArray
    for (String x : wName.split(" ")) {
      System.out.println(x);
    }

    // trim : Deletes whitespace at beginning and end
    // toUpperCase, toLowerCase

    // ---- STRING BUILDER & BUFFER ----
    // If you have to make many string changes
    // a StringBuilder may be better
    // Use a StringBuffer if using threads

    // Create StringBuilder
    StringBuilder sb = new StringBuilder("I'm a string builder");

    // Number of characters
    System.out.println(sb.length());

    // Get size set aside
    // Increase size with ensureCapacity
    System.out.println(sb.capacity());

    // Append a primitive or string
    sb.append(" Yeah");

    // Insert at index
    System.out.println(sb.insert(6, "Big "));

    // Replace at indexes
    System.out.println(sb.replace(6, 9, "wig"));

    // Extract substring
    System.out.println(sb.substring(6, 10));

    // Delete characters at indexes
    System.out.println(sb.delete(6, 10));

    // Get char at index
    System.out.println(sb.charAt((4)));

    // Get index for string
    System.out.println(sb.indexOf("Yeah"));
  }
}
