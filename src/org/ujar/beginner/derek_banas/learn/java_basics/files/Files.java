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

package org.ujar.beginner.derek_banas.learn.java_basics.files;

import java.io.*;

public class Files {

    // ---- FILE IO ----
    public void run() {
        System.out.printf("\n### %s\n", Files.class.getSimpleName());

        // A File object is a file or directory
        // Create a file object not a file on the drive
        File f1 = new File("/tmp/f1.log");

        // Create a file on the hardrive
        try {
            if(f1.createNewFile()) {
                System.out.println("File Created");

                // Rename the file
                f1.renameTo(new File("/tmp/f1BU.log"));

                // Delete the file
                f1.delete();

            } else {
                System.out.println("File not Created");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // File object tied to a directory
        File d1 = new File("./");

        // Check if we have a directory and print files
        if(d1.isDirectory()) {
            File[] files = d1.listFiles();
            for(File x : files) System.out.println(x.getName());
        }

        // A stream is a sequence of characters
        // Character Streams are strings
        // Binary Streams are bytes of data from
        // primitive types
        // Create a file for writing
        File f2 = new File("/tmp/f2.txt");
        try {
            PrintWriter pw =
                    // Formats the data you are writing
                    new PrintWriter(
                            // Saves data until it is time to write
                            new BufferedWriter(
                                    // Writes characters to the file
                                    // Add FileWriter(f2, true) to append
                                    new FileWriter(f2)), true);
            // Write text to the file
            pw.println("This is sample text");
            // Close the file
            pw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Reading from a file
        f2 = new File("/tmp/f2.txt");

        try {
            // Reads data 1 line at a time
            BufferedReader bR = new BufferedReader(
                    // Reads 1 character at a time
                    new FileReader(f2));

            // Read the line
            String text = bR.readLine();

            // Stop when null is received (End of File)
            while(text != null) {
                System.out.println(text);
                text = bR.readLine();
            }
            bR.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // ---- WRITING BINARY DATA ----
        // You don't have to nest the constructors
        File f3 = new File("/tmp/f3.dat");

        // Connects to file to write raw bytes
        FileOutputStream fOS;

        try {

            // FileOutputStream(f3, true) to append
            fOS = new FileOutputStream(f3);

            // Adds buffering t write in bulk
            BufferedOutputStream bOS = new BufferedOutputStream(fOS);

            // Allows you to write primitives to the stream
            DataOutputStream dOS = new DataOutputStream(bOS);

            String name = "Derek";
            int age = 44;
            double bal = 1234.56;

            // Write string
            dOS.writeUTF(name);
            // Write int
            dOS.writeInt(age);
            // Write double
            dOS.writeDouble(bal);
            // Close file
            dOS.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Reading with a DataInputStream
        f3 = new File("/tmp/f3.dat");

        // File used for the input stream
        FileInputStream fIS;

        try {
            fIS = new FileInputStream(f3);

            // Adds buffering while pulling data
            BufferedInputStream bIS = new BufferedInputStream(fIS);

            // Provides methods for reading data
            DataInputStream dIS = new DataInputStream(bIS);
            System.out.println(dIS.readUTF());
            System.out.println(dIS.readInt());
            System.out.println(dIS.readDouble());
            fIS.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
