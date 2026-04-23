class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}


class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args){

        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);    
    }
}
// 2 Categories of Inheritance concept:
//  1] Subclass (child) :- the class that inherits from another class.
//  2] Superclass (parent) :- the class being inherited from
// "extends" keyword is used to inherit from another class.
// use the "final" keyword before class declaration if you wish to not 
// final class Vehicle {
// class Car extends Vehicle {
//   ...
// }/ 
