public class objects {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020);

        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);

        myCar.startEngine();
    }
}

class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("The " + make + " " + model + " engine has started.");
    }
}