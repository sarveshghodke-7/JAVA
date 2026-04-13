public class typecasting {
    public static void main(String[] args){
        //Typecasting is the process of converting a variable from one data type to another. 
        // In Java, there are two types of typecasting: 
        // 1. Implicit typecasting (also known as widening conversion) - It is done automatically by the compiler when we assign a value of a smaller data type to a larger data type. For example:
        int myInt = 10;
        double myDouble = myInt; // Implicit typecasting from int to double
        System.out.println(myDouble); // Output: 10.0

        // 2. Explicit typecasting (also known as narrowing conversion) - It is done manually by the programmer when we want to assign a value of a larger data type to a smaller data type. For example:
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Explicit typecasting from double to int
        System.out.println(myInt2); // Output: 9

        // Some things to keep in mind about typecasting in Java:
        // 1. When you perform explicit typecasting, you may lose some data if the value being casted is too large for the target data type.
        // 2. When you perform implicit typecasting, there is no loss of data because the value being casted is always smaller than the target data type.
        // 3. You cannot perform typecasting between incompatible data types, such as from a String to an int or from a boolean to a double.
        // 4. Typecasting can also be used with non-primitive data types, such as classes and objects, but it is more complex and requires the use of inheritance and polymorphism.
        // 5. Typecasting can also be used with arrays, interfaces, generics but it is also more complex and requires the use of inheritance and polymorphism.
    }
}
