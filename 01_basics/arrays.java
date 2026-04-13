public class arrays {
    public static void main(String[] args) {
        // Declaring an array
        int[] numbers = new int[5];

        // Initializing an array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing array elements
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 3: " + numbers[3]);
        System.out.println("Element at index 4: " + numbers[4]);

        // Finding the length of an array
        System.out.println("Length of the array: " + numbers.length);
    
        // Looping through an array
        System.out.println("Elements in the array:");   
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // In Java, arrays are objects that store multiple values of the same type.
        // The length of an array is fixed and cannot be changed after it is created.
        // Arrays can be of any data type, including primitive types and non-primitive types.
        // When you create an array, you are actually creating an object of the array class.
        // The index of an array starts from 0, which means the first element is at index 0, the second element is at index 1, and so on.
        // You can also declare and initialize an array in a single line using array literals. For example:
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println("Elements in the second array:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        // Multidimensional arrays are arrays of arrays. They can be declared and initialized in a similar way to one-dimensional arrays. For example:
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Elements in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Arrays in Java are zero-indexed, which means that the first element of the array is at index 0, the second element is at index 1, and so on.
        // When you create an array, you are actually creating an object of the array class. The array class provides various methods to manipulate arrays, such as sorting, searching, and copying arrays.
        // Arrays can also be used to store objects of a class. For example:
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Names in the array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // In Java, arrays are passed by reference, which means that when you pass an array to a method, 
        // you are passing a reference to the array object, not a copy of the array.
        // This means that if you modify the array inside the method, the changes will be reflected in 
        // the original array outside the method.
        // Arrays in Java are also used to store command-line arguments. When you run a Java program from 
        // the command line, you can pass arguments to the program, and these arguments are stored in an array of strings called args. For example:
        // public static void main(String[] args) {
        //     System.out.println("First argument: " + args[0]);
        //     System.out.println("Second argument: " + args[1]);
        // }
        // In this example, if you run the program as java arrays "Hello" "World", the output will be:
        // First argument: Hello
        // Second argument: World
        // Arrays in Java are a powerful data structure that allows you to store and manipulate multiple 
        // values of the same type efficiently. They are widely used in various applications, such as 
        // sorting algorithms, searching algorithms, and data storage.
        // It is important to note that arrays in Java are fixed in size, which means that once you create 
        // an array, you cannot change its size. If you need a dynamic data structure that can grow and shrink 
        // in size, you can use other data structures such as ArrayList or LinkedList from the Java Collections Framework.
    }
}