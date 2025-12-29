public class Driver {

    String name;
    String license;

    public Driver(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public void displayDriverInfo() {
        System.out.println("Driver name: " + name);
        System.out.println("License: " + license);
    }
}