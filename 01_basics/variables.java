public class variables {
    public static void main(String[] args){
        String firstname = "John ";
        String lastname = "Doe";
        String fullname = firstname + lastname; // Concatenation of strings
        System.out.println(fullname);

        int age = 30; // Integer variable
        double height = 5.9; // Double variable
        boolean isStudent = false; // Boolean variable

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);

        int sum = age + (int)height;
        System.out.println("Sum of age and height: " + sum);

        int x = 5;
        int y = 6;

        System.out.println("The sum is " + x + y);   // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

        int a = 10, b = 20, c = 30; //Multiple variables declared in a single line.
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

        int d, e, f; // Multiple variables declared in a single line without initialization.
        d = 40;
        e = 50;
        f = 60;
        System.out.println("d: " + d + ", e: " + e + ", f: " + f);

        //Rules for naming variables in Java:
        // 1. Variable names must start with a letter, underscore (_), or dollar sign ($).
        // 2. Variable names cannot start with a number.
        // 3. Variable names can only contain letters, numbers, underscores, or dollar signs
        // 4. Variable types once declared cannot be changed i.e if you declare a variable as int, you cannot assign a string value to that variable later in the code.


        // Good to know: In Java, there are two types of variables:
        // 1. Local Variables: These are variables that are declared inside a method and can only be used within that method. 
        // They are created when the method is called and destroyed when the method is finished.
        // 2. Instance Variables: These are variables that are declared inside a class but outside of any method. 
        // They are also known as member variables or fields. They can be used by all methods in the class and are created when an object of the class is created and destroyed when the object is destroyed.
        // In the above code, x and y are local variables, while age, height, isStudent, firstname, lastname, and fullname are instance variables.
        // Local variables must be initialized before use, while instance variables are automatically initialized to their default values (0 for numeric types, false for boolean, and null for object references).
        // The precision of float is only 6-7 decimal digits, while double variables have a precision of about 16 digits.
        // The char data type is used to store a single character, and it is enclosed in single quotes (' '), while String is used to store a sequence of characters and is enclosed in double quotes (" ").
        // A String in Java is actually a non-primitive data type, because it refers to an object. When you create a String variable, 
        // you are actually creating an object of the String class.
        // String is knows as the 9th data type in Java, but it is not a primitive data type, it is a class.
    }
}
