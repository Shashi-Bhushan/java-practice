/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Shashi Bhushan
 * @date Sep 27, 2019
 */
package in.shabhushan.practice.geeks;

interface Parent {
    int x = 0;
}

interface SecondParent {
    int x = 10;
}

class Child implements Parent, SecondParent {
    public static void printX() {
        //System.out.println("Value of x is " + x);
    }
}

public class MethodAmbiguity {

    /////////////////////////////////////////////
    // Overloaded Methods with Subclass Arguments
    /////////////////////////////////////////////
    public static void overloadedMethodOne(Object one) {
        System.out.println("Overloaded Method One with Object.");
    }

    public static void overloadedMethodOne(String two) {
        System.out.println("Overloaded Method One with String.");
    }

    ///////////////////////////////////////////////
    // Overloaded Methods with Same Level Arguments
    ///////////////////////////////////////////////
    public static void overloadedMethodTwo(String one) {
        System.out.println("Overloaded Method Two with String.");
    }

    public static void overloadedMethodTwo(StringBuilder two) {
        System.out.println("Overloaded Method Two with String Builder.");
    }

    ///////////////////////////////////////////////////////
    // Overloaded Methods with Different Order of Arguments
    ///////////////////////////////////////////////////////
    public static void overloadedMethodThree(Object one, String two) {
        System.out.println("Overloaded Method Three with Object and String.");
    }

    public static void overloadedMethodThree(String one, Object two) {
        System.out.println("Overloaded Method Three with String and Object.");
    }
}
