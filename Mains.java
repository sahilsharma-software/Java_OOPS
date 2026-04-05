// Vehicle.java
 interface Vehicle {
    void startEngine();       // abstract and public 
    void stopEngine();        // abstract and public 
    void getFuelLevel();      // abstract and public
}

// Cycle.java
class Cycle implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("START PADDLING");
    }

    @Override
    public void stopEngine() {
        System.out.println("STOP PADDLING");
    }

    @Override
    public void getFuelLevel() {
        System.out.println("ENVIRONMENT FRIENDLY");
    }
}

// Boat.java
class Boat implements Vehicle {
    int fuelLevel;

    Boat(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine() {
        System.out.println("ENGINE START");
    }

    @Override
    public void stopEngine() {
        System.out.println("ENGINE STOP");
    }

    @Override
    public void getFuelLevel() {
        System.out.println("Fuel level is: " + fuelLevel);
    }
}

// Main.java
public class Mains {
    public static void main(String[] args) {
        Cycle obj = new Cycle();
        obj.startEngine();
        obj.stopEngine();
        obj.getFuelLevel();

        System.out.println("\n");

        Boat objs = new Boat(34);
        objs.startEngine();
        objs.stopEngine();
        objs.getFuelLevel();
    }
}
