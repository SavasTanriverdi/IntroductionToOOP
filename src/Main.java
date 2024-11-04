public class Main {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Displaying car details
        myCar.displayInfo();

        // Accelerating the car
        myCar.accelerate(30);
        myCar.accelerate(20);

        // Stopping the car
        myCar.stop();
    }
}