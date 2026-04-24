class OuterClass {
    int x = 10;

    class InnerClass{
        int y = 5;
    }
}

public class innerr {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
// Class within a class
// It's purpose is to group classes that belong together
// To access the inner class, create an object of the outer class, and then create an object of the inner class
// 4 types:
// ------------------------------------------------------
//  1] Non-static Inner Class (Member Inner class):->
//     class Outer {
    //     int x = 10;

    //     class Inner {
    //         void show() {
    //             System.out.println(x);
    //         }
    //     }
    // }
//  Key points:
//        Needs outer class object
//        Can access all outer class members (including private)
// ------------------------------------------------------
// 2] Static Nested Class:->
//  class Outer {
//     static int x = 10;

//     static class Inner {
//         void show() {
//             System.out.println(x);
//         }
//     }
// }
//  Key Points:
//      1] Does NOT need outer object
//      2] Can access only static members of outer class
// -------------------------------------------------------------
//  3] Local Inner Class (Inside a Method):->
        // class Outer {
        //     void display() {
        //         class Inner {
        //             void msg() {
        //                 System.out.println("Hello from local inner class");
        //             }
        //         }

        //         Inner i = new Inner();
        //         i.msg();
        //     }
        // }
//  Key Points:->
//        Defined inside a method
//        Cannot be accessed outside that method
//        Can access final or effectively final variables
// ------------------------------------------------------------------------------------------
// 4] Anonymous Inner Class:->
    // abstract class Animal {
    //     abstract void sound();
    // }

    // class Test {
    //     public static void main(String[] args) {
    //         Animal a = new Animal() {
    //             void sound() {
    //                 System.out.println("Dog barks");
    //             }
    //         };
    //         a.sound();
    //     }
    // }
    //  Key points:
        // No class name
        // Used for one-time use
        // Common in event handling, threads
// -------------------------------------------------------------------------
// Inner Classes:
//  │
//  ├── Member Inner (non-static) → needs outer object
//  ├── Static Nested → independent
//  ├── Local Inner → inside method
//  └── Anonymous → no name, one-time use