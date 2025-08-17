
interface Vehicle {
    void start();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting...");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starting...");
    }
}
class TransportService {
    private Vehicle vehicle;
    public TransportService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        System.out.println("Starting the journey...");
        vehicle.start();
    }
}

// Main class to demonstrate DIP
public class dependencyInversionPrinciple {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        TransportService carService = new TransportService(car);
        carService.startJourney();

        System.out.println();

        TransportService bikeService = new TransportService(bike);
        bikeService.startJourney();
    }
}
