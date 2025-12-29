public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Abilmansur", "55111");
        Driver driver2 = new Driver("Bekzat", "23222");

        Vehicle car = new Car("Toyota", 2022);
        Vehicle bike = new Motorcycle("Yamaha", 2021);
        Vehicle truck = new Truck("BMW M5", 2020);

        car.setDriver(driver1);
        bike.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = {car, bike, truck};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
            vehicles[i].displayInfo();
            vehicles[i].stopEngine();
            System.out.println("-------------");
        }
    }
}