// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class abstractt {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
// Abstraction - process of hiding details and showing only essential information to the user.
// Abstraction can be achieved in 2 ways:->
//          1] Abstract Classes
//          2] Interfaces

// "abstract" keyword - non-access modifier
// Abstract Class:-  restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
// Abstract Method:- can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).


