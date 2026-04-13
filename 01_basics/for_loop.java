public class for_loop {
    public static void main(String[] args){
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // enhanced for loop (for-each loop)
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        //for-each loop is a simplified version of the for loop that is used to iterate over arrays or collections. It eliminates the need for an index variable and provides a more concise syntax for iterating through elements.
        // for(String fruit : fruits) - 1]String- data type of the variable 'fruit' which will hold each element of the 'fruits' array during iteration.
        //                               2]fruit- variable that will hold the current element of the 'fruits' array during each iteration of the loop.
        //                               3]fruits- the array that we want to iterate over. The for-each loop will automatically iterate through each element of the 'fruits' array and assign it to the variable 'fruit' in each iteration, allowing us to perform operations on each element without needing to manage an index variable.
        // The for-each loop is particularly useful when you want to iterate through all elements of an array or collection without needing to know the index of each element. It provides a cleaner and more readable syntax compared to a traditional for loop when working with arrays or collections.
        // In summary, the for loop is a powerful control structure that allows you to execute a block of code a specific number of times, while the enhanced for loop (for-each loop) provides a more concise and readable way to iterate over arrays or collections without needing to manage an index variable.


        // The for loop is used to execute a block of code a specific number of times. It consists of three parts: initialization, condition, and increment/decrement.
        // The initialization is executed only once at the beginning of the loop, and it is typically used to initialize a counter variable.
        // The condition is evaluated before each iteration of the loop, and if it evaluates to true, the loop body is executed. If it evaluates to false, the loop terminates.
        // The increment/decrement is executed after each iteration of the loop body, and it is typically used to update the counter variable.
        // In the first example, the for loop initializes the variable 'i' to 0, checks if 'i' is less than 5, and increments 'i' by 1 in each iteration. The loop will execute 5 times, printing the value of 'i' from 0 to 4.
        // In the second example, the enhanced for loop (also known as the for-each loop) is used to iterate over an array of strings. It simplifies the syntax when iterating over collections or arrays by eliminating the need for an index variable.
        // The enhanced for loop iterates through each element in the 'fruits' array and assigns it to the variable 'fruit', which can then be used within the loop body to perform operations on each element.
    }    
}
