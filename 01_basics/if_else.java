public class if_else {
    public static void main(String[] args){
        int number = 10;

        // if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // if-else-if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Nested if statement
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is not positive.");
        }

        // Ternary operator
        String result = (number > 0) ? "Positive" : "Not Positive";
        System.out.println("The number is: " + result);

        // The if-else statements are used to execute a block of code based on a condition.
        // The condition is evaluated to either true or false, and the corresponding block of code is executed accordingly.
        // The if statement is used to execute a block of code if a specified condition is true.
        // The if-else statement is used to execute one block of code if a specified condition is true, and another block of code if the condition is false.
        // The if-else-if statement is used to execute one block of code among multiple blocks of code based on multiple conditions.
        // The nested if statement is used to check for multiple conditions by nesting one if statement inside
        // another if statement.
        // The ternary operator is a shorthand for an if-else statement and is used to evaluate a boolean expression and return one of two values based on the result.
    }    
}
