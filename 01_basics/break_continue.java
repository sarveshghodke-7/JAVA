public class break_continue {
    public static void main(String[] args){
        // The break statement is used to exit a loop or switch statement prematurely. 
        // When the break statement is encountered, the loop or switch statement is immediately terminated, and the program continues with the next statement after the loop or switch.

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is equal to 5
            }
            System.out.println(i);
        }

        // The continue statement is used to skip the current iteration of a loop and move on to the next iteration. 
        // When the continue statement is encountered, the remaining code in the current iteration is skipped, and 
        // the loop proceeds with the next iteration.

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i); // This will only print odd numbers
        }
        // In the first loop, the break statement is used to exit the loop when the variable i is equal to 5.
        // In the second loop, the continue statement is used to skip the even numbers and only print the odd 
        // numbers from 0 to 9.
        // The break and continue statements are useful for controlling the flow of loops and can help to improve 
        // the efficiency of your code by allowing you to exit or skip iterations when certain conditions are met.
        // It is important to use break and continue statements judiciously, as excessive use can make your code 
        // harder to read and understand.
        // In summary, the break statement is used to exit a loop or switch statement prematurely, while the 
        // continue statement is used to skip the current iteration of a loop and move on to the next iteration.
    }   
}
