public class scope {
    public static void main(String[] args) {
        int x = 10; // This variable is in the scope of the main method
        System.out.println("Value of x in main method: " + x);
        
        // Calling a method that has its own scope
        printValue();
        
        // Trying to access variable x from printValue method will result in an error
        // System.out.println("Value of x in main method: " + x); // This will cause a compile-time error
    }
    
    public static void printValue() {
        int y = 20; // This variable is in the scope of the printValue method
        System.out.println("Value of y in printValue method: " + y);
        
        // Trying to access variable x from main method will result in an error
        // System.out.println("Value of x in printValue method: " + x); // This will cause a compile-time error
    }
    
    // In Java, the scope of a variable refers to the region of the program where the variable is defined and can be accessed. 
    // Variables can have different scopes depending on where they are declared. For example, a variable declared inside a method 
    // is only accessible within that method, while a variable declared outside of any method (at the class level) is accessible 
    // throughout the entire class.
    // In the example above, we have two methods: main and printValue. The variable x is declared in the main method, so it is only 
    // accessible within that method. The variable y is declared in the printValue method, so it is only accessible within that method. 
    // If we try to access variable x from the printValue method or variable y from the main method, we will get a compile-time error because 
    // those variables are out of scope for those methods.

    // In Java, there are also other types of scopes such as block scope (variables declared inside a block of code, 
    // such as an if statement or a loop)
    // and class scope (variables declared at the class level, which are accessible throughout the entire class).

    //Example of block scope:
    public static void blockScopeExample() {
        if (true) {
            int z = 30; // This variable is in the scope of the if block
            System.out.println("Value of z in if block: " + z);
        }
        // Trying to access variable z outside of the if block will result in an error
        // System.out.println("Value of z outside of if block: " + z); // This will cause a compile-time error
    }

    //Example of class scope:
    static int classVariable = 40; // This variable is in the scope of the entire class
    public static void classScopeExample() {
        System.out.println("Value of classVariable in classScopeExample method: " + classVariable);
    }
    // In the example above, we have a variable classVariable that is declared at the class level, so it is accessible throughout the entire class.
    // We can access classVariable from any method in the class, including the main method and the classScopeExample method, as long as the 
    // variable is static.
    // If we try to access classVariable from a non-static method, we will get a compile-time error because non-static methods 
    // cannot access static variables.
    // In summary, understanding the scope of variables is important in Java because it helps you to avoid errors and to write more efficient 
    // and organized code.
    
}