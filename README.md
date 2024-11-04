IntroductionToOOP

This project is a basic introduction to Object-Oriented Programming (OOP) concepts in Java. OOP is a programming paradigm based on objects, which can contain data in the form of fields and code in the form of methods. This example demonstrates the core concepts of OOP using a Car class with attributes and methods.
Project Structure

    IntroductionToOOP.java: Contains the Car class, which models a car with properties like brand, model, year, and speed. Additionally, it includes methods to display car information, accelerate, and stop the car.

Code Overview
Key Concepts

    Class:
        A blueprint for creating objects. In this example, Car is a class with attributes and methods representing a car's properties and behaviors.

    Object:
        An instance of a class. In the main method, myCar is an object created from the Car class.

    Attributes (Properties):
        Define the characteristics of the class. In Car, the attributes are brand, model, year, and speed.

    Constructor:
        A special method that initializes new objects. Car has a constructor that takes brand, model, and year as parameters and sets speed to 0.

    Methods:
        Functions defined within a class to perform actions or behaviors. The Car class has methods for:
            displayInfo(): Prints car details.
            accelerate(int increase): Increases the car's speed.
            stop(): Sets the speed to 0.

Usage

Example output:

    Car: Toyota Corolla (2020)
    Current speed: 0 km/h
    Accelerated by 30 km/h. Current speed: 30 km/h
    Accelerated by 20 km/h. Current speed: 50 km/h
    The car has stopped. Current speed: 0 km/h

Key Concepts

    Encapsulation: Attributes are private, meaning they cannot be accessed directly from outside the Car class. This ensures that object data is secure and only accessible through defined methods.
    Object Creation: The Car class serves as a blueprint to create instances with specified attributes and behaviors.

Author

This project serves as an introductory example of Object-Oriented Programming concepts in Java.

