public class method_overloading {
    public static void main(String[] args) {
        int mymethod(int a, int b){
            return a + b;
        }

        float mymethod(float a, float b){
            return a + b;
        }

        double mymethod(double a, double b){
            return a + b;
        }

        // In Java, method overloading is a feature that allows you to have multiple methods with the same name but different parameters.
        // The Java compiler will determine which method to call based on the number and types of the parameters.   
        // This allows you to create methods that perform similar tasks but with different input types or numbers of parameters.
        // In the example above, we have three overloaded methods named "mymethod". The first method takes two integer parameters 
        // and returns their sum, the second method takes two float parameters and returns their sum, and the third method takes 
        // two double parameters and returns their sum. When we call the "mymethod" with different types of arguments, 
        // the appropriate method will be called based on the types of the arguments passed. For example, if we call "mymethod(5, 10)", 
        // it will call the first method and return 15. If we call "mymethod(5.0f, 10.0f)", it will call the second method and return 15.0f. If we call "mymethod(5.0, 10.0)", it will call the third method and return 15.0.
        // Method overloading can also be used to provide default values for parameters.
    }    
}
