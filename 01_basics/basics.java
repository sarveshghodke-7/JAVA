public class basics {
    public static void main(String[] args){
        System.out.println(args[0]+args[1]);
    }
}
//Things to know about Java:
// 1] Each and every line of code in Java should be written inside a class.
// 2] The name of the public class should be same as the file name.
// 3] The main method is the entry point of the program, it is the method that is executed when the program is run.
// 4] The main method should be declared as public static void main(String[] args)
// 5] There is only one public class allowed inside a single Java file, but you can have multiple non-public classes inside a single Java file.
// 6] Java program is compiled using: javac filename.java and run using java classname (without .java extension)
// 7] If there is no public class in the Java file, then the name of the Java file can be anything.
// 8] That Java file can be compiled and run using the name of any class present in that file.
//    For example, if there is a class named "Test" in the Java file, then the Java file can be compiled and run using the name "Test" instead of the public class name.
// 9] Behind the scenes, Java compiler (JVM) creates a .class file for each class present in the Java file, and the name of the .class file is 
//    same as the name of the class. So if there is a class named "Test" in the Java file, then a .class file named "Test.class" will be created after
//    compilation, and this .class file will be executed when we run the program using the name "Test".
// 10] Even if there is a public class in the Java file, we can still compile and run the Java file using the name of any class present in that file, 
//     but it is not recommended to do so, as it can lead to confusion and error in the code. Also running that Java file will only execute that class and not the public class, 
//     so it is always recommended to run the Java file using the name of the public class.
