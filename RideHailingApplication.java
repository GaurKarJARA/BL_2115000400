// Abstract Class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + "\nDriver Name: " + driverName + "\nRate per Km: " + ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class VehicleGPS implements GPS {
    private String currentLocation;

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle car = new Car("C13", "John Doe", 15.0);
        Vehicle bike = new Bike("B_223", "Jane Smith", 10.0);
        Vehicle auto = new Auto("j_123", "David Brown", 12.0);

        System.out.println("Car Details:\n" + car.getVehicleDetails());
        System.out.println("Bike Details:\n" + bike.getVehicleDetails());
        System.out.println("Auto Details:\n" + auto.getVehicleDetails());
        
        System.out.println("Car Fare for 10 Km: " + car.calculateFare(10));
        System.out.println("Bike Fare for 10 Km: " + bike.calculateFare(10));
        System.out.println("Auto Fare for 10 Km: " + auto.calculateFare(10));

        VehicleGPS gps = new VehicleGPS();
        gps.updateLocation("Central Park");
        System.out.println("Current Location: " + gps.getCurrentLocation());
    }
}