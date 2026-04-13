public class boilerplate {
    public static void main(String[] args){
        System.out.println(args[0]);
    }
}

//public class boilerplate - 1]public- keyword (access modifier) 
//                      2]class- keyword (used to declare a class) 
//                      3]boilerplate - class name - the name of the public class should be same as the file name.

//public static void main(String[] args) - 
// 1]public- keyword (access modifier)
// 2]static- keyword (used to indicate that the method belongs to the class rather than an instance of the class, 
//           used when we have to call the method without creating an object of the class)
// 3]void- keyword (used to indicate that the method does not return any value)
// 4]main- method name (the name of the method should be main, as it is the actual entry point of the program)
// 5]String[] args- parameter (used to pass command-line arguments to the program, it is an array of strings)
//             The args parameter is an array of strings that can be used to pass command-line arguments to the program. 
//             In this example, we are printing the first argument passed to the program
//             So when you run this program as java basics "Hello, World!", here Hello - args[0] and World! - args[1]
//Above is the basic boilter plate code for any java program, you can write your code inside the main method.