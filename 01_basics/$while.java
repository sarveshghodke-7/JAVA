public class $while {
    public static void main(String[] args){
        int count = 0;

        // while loop
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // do-while loop
        int doCount = 0;
        do {
            System.out.println("Do Count: " + doCount);
            doCount++;
        } while (doCount < 5);

        // The while loop is used to execute a block of code repeatedly as long as a specified condition is true.
        // The condition is evaluated before the execution of the loop body, so if the condition is false at the beginning, 
        // the loop body will not be executed at all.
        // The do-while loop is similar to the while loop, but it guarantees that the loop body will be executed at least once,
        //  as the condition is evaluated after the execution of the loop body.
        // In the while loop example, the variable 'count' is initialized to 0, and the loop continues to execute as long as 'count' is less than 5.
        // In the do-while loop example, the variable 'doCount' is also initialized to 0, and the loop continues to execute as long 
        // as 'doCount' is less than 5. However, even if 'doCount' was initialized to a value greater than or equal to 5, the loop body would still execute at least once before the condition is evaluated.
        // It is important to ensure that the condition in a while loop eventually becomes false, otherwise it will result in 
        // an infinite loop. In the examples above, both loops will execute 5 times before terminating.
        // The while and do-while loops are useful for situations where you want to repeat a block of code until a certain condition is met, 
        // such as iterating through a collection, waiting for user input, or performing a task until a specific state is achieved.
        // It is also important to note that the while and do-while loops can be nested inside each other, allowing for more complex looping 
        // structures when needed.
        // In summary, the while loop is used when you want to execute a block of code repeatedly as long as a condition is true, while 
        // the do-while loop is used when you want to ensure that the block of code is executed at least once before checking the condition.
    }
}
