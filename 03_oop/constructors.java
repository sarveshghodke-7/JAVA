public class constructors {
    int x;

    public constructors(){
        x = 7; // Set the inital value of x to 7.
    }

    public static void main(String[] args) {
        constructors myObj = new constructors(); // Create an object of class constructors (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }
}

// Constructor name should be same as the class name and it should not have a return type. 
// In the example above, the constructor is named constructors, which is the same as the class name. 
// The constructor is called when we create an object of the class using the new keyword. 
// In this case, when we create myObj, the constructor is called and it initializes x to 7.

//
// It is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
// It can be used to set initial values for object attributes. A constructor has the same name as the class and does not have 
// a return type, not even void.
