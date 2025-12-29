public class Car extends Vehicle {

    public Car(String brand, int year) {
        super(brand, year);
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}