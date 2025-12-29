public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}