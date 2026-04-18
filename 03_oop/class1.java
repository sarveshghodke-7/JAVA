public class class1 {
    static int x = 5;
}
class second{
    public static void main(String[] args) {
        System.out.println(class1.x);
    }
}

// Here we acccessed the non-static variable x by creating an object of the class class1 and then we can access the variable x using that object.
// In Java, non-static variables belong to an instance of a class, which means you need to create an object of the class to access them. 
// Static variables, on the other hand, belong to the class itself and can be accessed without creating an object.
// One more important observation is that if the public class doesn't contain the main(String[] args) method, it cannot be executed directly.
// We will have to create another class with the main method to execute the code.
// Like in the above code, it fails when you run it with this command: java class1.java or java class1, 
// BUT it works when you run it with this command: java second.java or java second, because the main method is present in the second class.