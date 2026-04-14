public class methods {
    public static void main(String[] args) {
        // Calling a method
        int result = add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);
    }

    // Defining a method
    public static int add(int a, int b) {
        return a + b;
    }
    
    // In Java, a method is a block of code that performs a specific task. It is defined within a class and 
    // can be called to execute the code it contains. Methods can take parameters, which are values passed to the method 
    // when it is called, and they can return a value as well.
    // The method defined above is called "add" and it takes two integer parameters, "a" and "b". It returns the sum of these two integers.
    // To call a method, you simply use the method name followed by parentheses. If the method takes parameters, you can pass the values 
    // inside the parentheses. In the example above, we call the "add" method with the values 5 and 10, and it returns the result, which 
    // is then printed to the console.


    //Some additional points about methods in Java:
    // 1. Methods can be overloaded, which means you can have multiple methods with the same name but different parameters. 
    //    The Java compiler will determine which method to call based on the number and types of the parameters.
    // 2. Methods can also be recursive, which means that a method can call itself. This can be useful for solving problems 
    //    that can be broken down into smaller, similar subproblems.
    // 3. In Java, methods can be defined as static or non-static. Static methods belong to the class and can be called without 
    //    creating an instance of the class, while non-static methods require an instance of the class to be called.
    // 4. Methods can also have access modifiers (such as public, private, protected) that determine who can access the method. 
    //    Public methods can be accessed from anywhere, private methods can only be accessed within the same class, and protected 
    //    methods can be accessed within the same package or subclasses.
    // 5. Methods can also throw exceptions, which are errors that can occur during the execution of a program. You can declare 
    //    that a method throws an exception using the "throws" keyword, and you can handle exceptions using try-catch blocks. 
    // 6. Static means that the method belongs to the Main class and not an object of the Main class. This allows us to call the method 
    //    without creating an instance of the Main class.
    // 7. Static methods can only access static variables and other static methods. They cannot access instance variables or instance methods 
    //    because they do not belong to any instance of the class.
    // 8. Static methods are often used for utility or helper methods that perform common tasks and do not require access to instance variables 
    //    or methods.
    // 9. Non-static methods, on the other hand, belong to an instance of the class and can access both static and instance variables and methods.
    // Example of status of static and non-static methods:
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
    
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    // Difference between static and non-static methods:
    // 1. Static methods belong to the class and can be called without creating an instance of the class, while non-static methods  
    //      require an instance of the class to be called.
    // 2. Static methods can only access static variables and other static methods, this means that they cannot access instance 
    //      variables or instance methods, while non-static methods can access both static and instance variables and methods.
    // A good example of above conditions is the main method in Java, which is a static method. It can be called without creating an 
    //      instance of the class, and it can only access static variables and methods.
    //      When you try to call a non-static method from a static method, you will get a compile-time error because the static method 
    //      does not have access to the instance variables and methods of the class.
    // 3. Static methods are often used for utility or helper methods that perform common tasks and do not require access to instance 
    //      variables or methods, while non-static methods are used for tasks that require access to instance variables or methods.

}