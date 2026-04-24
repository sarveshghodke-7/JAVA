public class supeeer {
    
}
// The "super" keyword is used to refer to the parent class of a subclass.
// The most common use of the "super" keyword is to eliminate the confusion between superclass and subclass that have methods with the same name.
//-------------------------
// It's used in two ways:->
//      1] To access attributes and methods from parent class
//      2] To call the parent class constructor
//
//-----------------------------------------------------------------
//--- Accessing Parent Class Methods:-------------------------------
// class Animal {
//   public void animalSound() {
//     System.out.println("The animal makes a sound");
//   }
// }

// class Dog extends Animal {
//   public void animalSound() {
//     super.animalSound(); // Call the parent method
//     System.out.println("The dog says: bow wow");
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     Dog myDog = new Dog();
//     myDog.animalSound();
//   }
// }
// OUTPUT:- The animal makes a sound
//          The dog says: bow vow
// // Note: Use super when you want to call a method from the parent class that has been overridden in the child class.
// ----------------------------------------------------------------

// --- Accessing Parent Attributes------------------------------------
// class Animal {
//   String type = "Animal";
// }

// class Dog extends Animal {
//   String type = "Dog";

//   public void printType() {
//     System.out.println(super.type); // Access parent attribute
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     Dog myDog = new Dog();
//     myDog.printType();
//   }
// }
// ----------------------------------------------------------------
// -------------------Calling Parent Constructor---------------------------
// "super" can be used to call the constructor of the parent class- useful when reusing initializing code.
// class Animal {
//   Animal() {
//     System.out.println("Animal is created");
//   }
// }

// class Dog extends Animal {
//   Dog() {
//     super(); // Call parent constructor
//     System.out.println("Dog is created");
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     Dog myDog = new Dog();
//   }
// }
// OUTPUT:- Animal is created
//          Dog is created
// Note: The call to super() must be the first statement in the subclass constructor.


