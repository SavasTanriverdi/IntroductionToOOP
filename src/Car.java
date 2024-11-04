public class Car {
    // Attributes (Properties)
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Constructor to initialize Car object
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0; // Default speed is 0
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
        System.out.println("Current speed: " + speed + " km/h");
    }

    // Method to accelerate the car
    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Accelerated by " + increase + " km/h. Current speed: " + speed + " km/h");
    }

    // Method to stop the car
    public void stop() {
        speed = 0;
        System.out.println("The car has stopped. Current speed: " + speed + " km/h");
    }
}
