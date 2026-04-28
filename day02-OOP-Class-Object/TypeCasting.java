public class TypeCasting {

    public static void main(String[] args) {

        System.out.println("----- WIDENING (IMPLICIT) -----");
        int a = 10;
        double d = a;   // int → double
        System.out.println("int: " + a);
        System.out.println("double: " + d);

        System.out.println("\n----- NARROWING (EXPLICIT) -----");
        double x = 10.75;
        int y = (int) x;   // double → int
        System.out.println("double: " + x);
        System.out.println("int: " + y);

        System.out.println("\n----- UPCASTING -----");
        Animal a1 = new Dog();  // child → parent
        a1.sound();

        System.out.println("\n----- DOWNCASTING -----");
        Animal a2 = new Dog();  // upcasting first
        Dog d1 = (Dog) a2;      // parent → child
        d1.sound();
        d1.bark();
    }
}

/* ---------------- CLASS FOR UPCASTING / DOWNCASTING ---------------- */
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks (Overridden method)");
    }

    void bark() {
        System.out.println("Dog specific method");
    }
}