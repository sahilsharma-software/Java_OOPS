abstract class Vehicle {  // Changed "Vehical" to "Vehicle"
    abstract void startEngine();
    
    void stopEngine() {
        System.out.println("plug out the key :");
    }
}

class Bike extends Vehicle {  // Changed "bike" to "Bike"
    void startEngine() {
        System.out.println("INSERT THE KEY TO START :");
    }
}

class Car extends Vehicle {  // Added the closing brace for the "Bike" class and changed "Car" to start with an uppercase letter
    void startEngine() {
        System.out.println("INSERT THE KEY TO START :");
    }
}  // Added the closing brace for the "Car" class

public class AbsClass {  // Changed "absClass" to "AbsClass"
    public static void main(String[] args) {
        Bike b = new Bike();  // Changed "bike" to "Bike"
        Car c = new Car();  // Ensured "Car" starts with an uppercase letter

        System.out.println("TO START BIKE :");
        b.startEngine();
        System.out.println("TO STOP BIKE :");
        b.stopEngine();

        System.out.println("TO START CAR :");
        c.startEngine();
        System.out.println("TO STOP CAR :");
        c.stopEngine();
    }
}
