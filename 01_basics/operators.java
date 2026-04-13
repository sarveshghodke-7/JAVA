public class operators {
    public static void main(String[] args){
        //Operators are special symbols that perform specific operations on one, two, or three operands and return a result. 
        // Here are some common types of operators in Java:
        
        // 1. Arithmetic Operators: These operators are used to perform basic arithmetic operations like addition, subtraction, multiplication, division, and modulus.
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b)); // Output: 15
        System.out.println("Subtraction: " + (a - b)); // Output: 5
        System.out.println("Multiplication: " + (a * b)); // Output: 50
        System.out.println("Division: " + (a / b)); // Output: 2
        System.out.println("Modulus: " + (a % b)); // Output: 0
        
        // 2. Relational Operators: These operators are used to compare two values and return a boolean result (true or false).
        System.out.println("Equal to: " + (a == b)); // Output: false
        System.out.println("Not equal to: " + (a != b)); // Output: true
        System.out.println("Greater than: " + (a > b)); // Output: true
        System.out.println("Less than: " + (a < b)); // Output: false
        System.out.println("Greater than or equal to: " + (a >= b)); // Output: true
        System.out.println("Less than or equal to: " + (a <= b)); // Output: false
        
        // 3. Logical Operators: These operators are used to combine multiple boolean expressions and return a boolean result.
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // Output: false
        System.out.println("Logical OR: " + (x || y)); // Output: true
        System.out.println("Logical NOT: " + (!x)); // Output: false
        
        // 4. Assignment Operators: These operators are used to assign values to variables.
        int c = 10; // This is an assignment operator that assigns the value 10 to the variable c.
        System.out.println("Initial value of c: " + c); // Output: 10
        c += 5; // This is an addition assignment operator that adds 5 to the current value of c and assigns the result back to c. Now c is 15.
        c -= 3; // This is a subtraction assignment operator that subtracts 3 from the current value of c and assigns the result back to c. Now c is 12.
        c *= 2; // This is a multiplication assignment operator that multiplies the current value of c by 2 and assigns the result back to c. Now c is 24.
        c /= 4; // This is a division assignment operator that divides the current value of c by 4 and assigns the result back to c. Now c is 6.
        c %= 5; // This is a modulus assignment operator that takes the modulus of the current value of c by 5 and assigns the result back to c. Now c is 1.
        
        // 5. Increment and Decrement Operators: These operators are used to increase or decrease the value of a variable by 1.
        int d = 10;
        System.out.println("Initial value of d: " + d); // Output: 10
        d++; // This is a post-increment operator that increases the value of d by 1. Now d is 11.
        d--; // This is a post-decrement operator that decreases the value of d by 1. Now d is 10.
        ++d; // This is a pre-increment operator that increases the value of d by 1 before using it. Now d is 11.
        --d; // This is a pre-decrement operator that decreases the value of d by 1 before using it. Now d is 10.   

        // 6. Ternary Operator: This operator is a shorthand for an if-else statement and is used to evaluate a boolean expression and return one of two values based on the result.
        int e = 10;
        String result = (e > 5) ? "Greater than 5" : "Less than or equal to 5"; // This is a ternary operator that checks if e is greater than 5. If it is true, it returns "Greater than 5", otherwise it returns "Less than or equal to 5". In this case, the result will be "Greater than 5".
        System.out.println(result);
    }
}
