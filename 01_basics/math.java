public class math {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);
        
        int difference = a - b;
        System.out.println("The difference of a and b is: " + difference);

        int product = a * b;
        System.out.println("The product of a and b is: " + product);

        int quotient = b / a;
        System.out.println("The quotient of b and a is: " + quotient);

        int modulus = b % a;
        System.out.println("The modulus of b and a is: " + modulus);

        // Java also provides a Math class that contains various methods for performing mathematical operations.
        double power = Math.pow(a, 2);
        System.out.println("The power of a to 2 is: " + power);

        double squareRoot = Math.sqrt(b);
        System.out.println("The square root of b is: " + squareRoot);

        // Some other useful methods in the Math class include:
        // Math.abs() - returns the absolute value of a number
        // Math.max() - returns the maximum of two numbers
        // Math.min() - returns the minimum of two numbers
        // Math.random() - returns a random number between 0.0 and 1.0
        // The Math class also provides constants such as Math.PI and Math.E for the value of pi and e respectively.
        System.out.println("The value of pi is: " + Math.PI);
        System.out.println("The value of e is: " + Math.E);
        // The Math class is part of the java.lang package, which is automatically imported in every Java program, so you can use it 
        // without needing to import it explicitly.
        // The Math class is a final class, which means that it cannot be subclassed. It also has a private constructor, which means 
        // that you cannot create an instance of the Math class.
    }
}
