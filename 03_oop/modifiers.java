public class modifiers {
    
}
//public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.
// Two types of Modifiers:
// 1] Access Modifiers
// 2] Non-Access Modifiers

//1] Access Modifiers:|
//  -- For Classes:
            // Either use public {class is accessible by any other class} or default{class is only accessible by classes in the same package}
//  -- For attributes, models and constructors:
            // public :-  The code is accessible for all classes
            // private:-  The code is only accessible within the declared class
            // protected:- The code is accessible in the same package and subclasses.
            
// Analogy: public:- a public park, everyone can enter
//          private:- your house key, only you can use it.


//2] Non-Access Modifiers:-
// They don't control the visibility like public or private, but instead they add other features to classes, methods & attributes.
//  Examples: final, static, abstract
// ---------------------------------------
//Final :-  If you don't want the ability to override existing attribute values, declare attributes as "final".
//Example:
// public class Main {
//   final int x = 10;
//   final double PI = 3.14;

//   public static void main(String[] args) {
//     Main myObj = new Main();
//     myObj.x = 50; // will generate an error: cannot assign a value to a final variable
//     myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
//     System.out.println(myObj.x);
//   }
// }



//Static:-  A static method belongs to the class, not to any specific object. This means you can call it without creating an object of the class.
//Example:
// public class Main {
//   // Static method
//   static void myStaticMethod() {
//     System.out.println("Static methods can be called without creating objects");
//   }

//   // Main method
//   public static void main(String[] args) {
//     myStaticMethod();         // Call the static method
//     Main.myStaticMethod();    // Or call it using the class name
//   }
// }




//Abstract:- An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:
// Example:
// abstract class Main {
//   public String fname = "John";
//   public int age = 24;
//   public abstract void study(); // abstract method
// }

// // Subclass (inherit from Main)
// class Student extends Main {
//   public int graduationYear = 2018;
//   public void study() { // the body of the abstract method is provided here
//     System.out.println("Studying all day long");
//   }
// }

// ---- For classes:                    Use final or abstract.
// ---- For attributes and methods:-    Use final, static, abstract, transient, synchronized, volatile.

// | Modifier     | Purpose                   |
// |--------------|---------------------------|
// | public       | Everywhere access         |
// | private      | Same class only           |
// | protected    | Package + subclass        |
// | default      | Same package              |
// | static       | Class-level shared        |
// | final        | Constant / no change      |
// | abstract     | Incomplete blueprint      |
// | synchronized | Thread safety             |
// | volatile     | Memory visibility         |
// | transient    | Skip during serialization |


