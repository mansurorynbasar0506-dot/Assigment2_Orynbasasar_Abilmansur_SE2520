public class Truck extends Vehicle {

    public Truck(String brand, int year) {
        super(brand, year);
    }

    public void startEngine() {
        System.out.println("Truck engine started");
    }

    public void stopEngine() {
        System.out.println("Truck engine stopped");
    }
}