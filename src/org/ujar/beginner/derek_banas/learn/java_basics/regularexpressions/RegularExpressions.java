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

package org.ujar.beginner.derek_banas.learn.java_basics.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

  // ---- REGULAR EXPRESSIONS ----
  // You can use character codes to search for
  // matching data
  public void run() {
    System.out.printf("\n### %s\n", RegularExpressions.class.getSimpleName());

    // ape followed by a space \\s
    // Other white space escapes: \b \f \n
    // \r \t \v
    // \\S : Anything not a space
    regexChecker("ape\\s", "ape at apex");

    // Match one of many characters with []
    regexChecker("[crmfp]at",
        "Cat rat mat fat pat");

    // Match characters in range and ignore case
    regexChecker("(?i)[c-f]at",
        "Cat rat mat fat pat");

    // Match any character except [^]
    regexChecker("[^c-f]at",
        "Cat rat mat fat pat");

    // Replace 1 - 4 letter p words with ant
    // \\w : Matches any single letter or number
    // \\w{5} : Would match 5 letters
    // \\W : Anyhting not a letter or number
    System.out.println(
        "pie pizza pork ".replaceAll(
            "p\\w{1,3}\\s", "ant "));

    // Match only acronyms with periods
    // . matches any single character
    // \\. escapes .
    regexChecker(".\\..\\..", "F.B.I. I.R.S. CIA");

    // Match only 4 digit numbers
    // \\D : Anything not a number
    regexChecker("\\d{4}", "1 23 456 7890");

    // Match telephone #
    regexChecker("\\w{3}-\\w{3}-\\w{4}",
        "412-555-1212");

    // Match 1 or more with +
    // Match emails
    regexChecker(
        "[\\w._%+-]{1,20}@[\\w.-]{2,20}.[A-Za-z]{2,3}",
        "db@aol.com m@.com @apple.com db@.com");

    // Match 0 or more
    regexChecker("[cat]+s?", "cat cats");

    // Match 0 or more with *
    regexChecker("[doctor]+['s]*",
        "doctor doctors doctor's");

    // Greedy versus lazy matching
    String rStr1 = "<name>Life On Mars</name><name>Freaks and Geeks</name>";
    regexChecker("<name>.*</name>", rStr1);

    // To get the smallest possible match use
    // *? +? or {n,}?
    regexChecker("<name>.*?</name>", rStr1);
  }

  // ---- REGULAR EXPRESSION METHOD ----
  private void regexChecker(String theRegex,
                            String str2Check) {

    // You define the regex using pattern
    Pattern regexPattern =
        Pattern.compile(theRegex);

    // Matcher searches a string for a match
    Matcher regexMatcher =
        regexPattern.matcher(str2Check);

    // Cycle through the positive matches and
    // print them to screen
    // Make sure string isn't empty and trim
    // off any whitespace
    while (regexMatcher.find()) {
      if (regexMatcher.group().length() != 0) {
        System.out.println(regexMatcher.group().trim());
        // You can get the starting and ending indexs
        System.out.println("Start Index: " + regexMatcher.start());
        System.out.println("Start Index: " + regexMatcher.end());
      }
    }
  }
}
