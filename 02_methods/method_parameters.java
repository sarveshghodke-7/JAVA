public class method_parameters {
    public static void main(String[] args){
        // Calling a method with parameters
        int result = multiply(5, 10);
        System.out.println("The product of 5 and 10 is: " + result);
    }    

    // Method with parameters
    public static int multiply(int a, int b) {
        return a * b;
    }
    // In Java, method parameters are variables that are defined in the method signature and are used to pass values 
    //      to the method when it is called.
    // In the example above, the method "multiply" takes two integer parameters, "a" and "b". When we call the method 
    //      with the values 5 and 10, these values are passed to the method as arguments, and the method returns the
    //      product of these two integers.
    // You can have multiple parameters in a method, and they can be of different data types. For example:
    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // In the example above, the method "printInfo" takes a String parameter "name" and an integer parameter "age". When we call this method with the values "Alice" and 30, it will print the name and age to the console.
    // You can also have parameters with default values in Java by using method overloading. For example:
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void greet() {
        System.out.println("Hello, World!");
    }   
    // In the example above, we have two overloaded methods named "greet". The first method takes a String parameter "name" 
    //      and prints a personalized greeting, while the second method takes no parameters and prints a generic greeting. When we call the "greet" method without any arguments, it will call the second method and print "Hello, World!" to the console. When we call the "greet" method with a name argument, it will call the first method and print a personalized greeting.
    // In Java, method parameters are passed by value, which means that when you pass a parameter to a method, you are passing a copy of the value.
    // This means that if you modify the parameter inside the method, it will not affect the original value outside the method. 
    // However, if the parameter is an object, you are passing a reference to the object, which means that if you modify the object inside the method, 
    // it will affect the original object outside the method.
    // For example:
    public static void modifyValue(int x) {
        x = 10; // This will not affect the original value outside the method
    }
    public static void modifyObject(StringBuilder sb) {
        sb.append(" World!"); // This will affect the original object outside the method
    }   
    // In the example above, the method "modifyValue" takes an integer parameter "x" and assigns it a new value. However, this does not affect the 
    // original value of "x" outside the method. On the other hand, the method "modifyObject" takes a StringBuilder object as a parameter and 
    // modifies it by appending " World!" to it. This modification will affect the original StringBuilder object outside the method because we are 
    // passing a reference to the object.    
    // Parameters are the actual variaebles defined in the method signature, while arguments are the actual values passed to the method when 
    // it is called. For example, in the method call "multiply(5, 10)", the parameters are "a" and "b", while the arguments are 5 and 10.
    
}
