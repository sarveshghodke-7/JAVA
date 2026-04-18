public class thiss {
    int x = 5;
    
    public void myMethod() {
        int x = 10;
        System.out.println(x); // Prints the local variable x
        System.out.println(this.x); // Prints the instance variable x
    }
    
    public static void main(String[] args) {
        thiss obj = new thiss();
        obj.myMethod();
    }   
}
// This keyword: The this keyword is a reference to the current object. It is used to refer to the instance variables of the current object. 
// In the example above, we have a class called thiss with an instance variable x and a method
// called myMethod. Inside the myMethod, we have a local variable x that shadows the instance variable x. 
// To access the instance variable x, we use this.x. This allows us to differentiate between the local variable and the instance variable. 
// When we run the program, it will print 10 (the local variable) and then 5 (the instance variable).   
// The this keyword can also be used to call other constructors in the same class. This is known as constructor chaining.
// Example of constructor chaining using this keyword:
class Example {
    int x;
    
    public Example() {
        this(10); // Calls the constructor with an int parameter
    }
    
    public Example(int x) {
        this.x = x; // Initializes the instance variable x
    }
    
    public static void main(String[] args) {
        Example obj1 = new Example(); // Calls the no-argument constructor
        System.out.println(obj1.x); // Prints 10
        
        Example obj2 = new Example(20); // Calls the constructor with an int parameter
        System.out.println(obj2.x); // Prints 20
    }
}