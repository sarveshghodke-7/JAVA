public class datatypes {
    //The variables in Java are used to store data values. Each variable has a specific type, which determines the kind of data it can hold. 
    // Here are some common types of variables in Java:
    // 1. byte: It can hold values from -128 to 127.
    // 2. short: It can hold values from -32,768 to 32,767.
    // 3. int: It can hold values from -2,147,483,648 to 2,147,483,647.
    // 4. long: It can hold values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
    // 5. float: It can hold decimal values with single precision.
    // 6. double: It can hold decimal values with double precision.
    // 7. char: It can hold a single character.
    // 8. boolean: It can hold either true or false.
    // Syntax to declare a variable: type variableName = value;
    public static void main(String[] args){
        int myNumber = 10; // This is an integer variable
        double myDecimal = 3.14; // This is a double variable
        char myChar = 'A'; // This is a char variable
        boolean myBoolean = true; // This is a boolean variable
        String name = "John"; // This is a String variable

        System.out.println("Integer: " + myNumber);
        System.out.println("Double: " + myDecimal);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + name);
        System.out.println(name + " is " + myNumber + " years old.");

        //You can declare multiple variables of the same type in a single line:
        int a = 5, b = 10, c = 15;
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

        //Java Constants: If you want to declare a variable that cannot be changed, you can use the final keyword:
        final double PI = 3.14159;  //final 
        System.out.println("PI: " + PI);

        //The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
        var myVar = "Hello, World!"; // The type of myVar is inferred to be String
        System.out.println(myVar);
        // var keyword only works when the variable is assigned a value at the time of declaration.
    }

}