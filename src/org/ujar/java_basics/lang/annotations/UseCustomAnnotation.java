/*
 *     Copyright 2021 UJar @ http://ujar.org
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

package org.ujar.java_basics.lang.annotations;
// This is the example code that processes the annotation
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class UseCustomAnnotation {
    public static void main(String [] args) {
        Class<SetCustomAnnotation> classObject = SetCustomAnnotation.class;
        readAnnotation(classObject);
    }

    private static void readAnnotation(AnnotatedElement element) {
        try {
            System.out.printf("\n### %s\n", UseCustomAnnotation.class.getSimpleName());
            System.out.println("Annotation element values: \n");
            if (element.isAnnotationPresent(TypeHeader.class)) {
                // getAnnotation returns Annotation type
                Annotation singleAnnotation =
                        element.getAnnotation(TypeHeader.class);
                TypeHeader header = (TypeHeader) singleAnnotation;

                System.out.println("Developer: " + header.developer());
                System.out.println("Last Modified: " + header.lastModified());

                // teamMembers returned as String []
                System.out.print("Team members: ");
                for (String member : header.teamMembers())
                    System.out.print(member + ", ");
                System.out.print("\n");

                System.out.println("Meaning of Life: "+ header.meaningOfLife());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}