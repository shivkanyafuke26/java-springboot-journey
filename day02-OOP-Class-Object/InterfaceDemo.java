public class InterfaceDemo {

    public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
        v.stop();

        System.out.println();

        Vehicle b = new Bike();
        b.start();
        b.stop();
    }
}

/* ---------------- INTERFACE ---------------- */
interface Vehicle {
    void start();   // abstract by default
    void stop();
}

/* ---------------- CAR CLASS ---------------- */
class Car implements Vehicle {

    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }
}

/* ---------------- BIKE CLASS ---------------- */
class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike is starting");
    }

    public void stop() {
        System.out.println("Bike is stopping");
    }
}