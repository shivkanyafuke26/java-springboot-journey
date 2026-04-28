public class Inheritance {

    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println();

        // Multilevel Inheritance
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();

        System.out.println();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println();

        // Hybrid Inheritance (via Interface + Class)
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.camera();
        sp.internet();
    }
}

/* ---------------- SINGLE INHERITANCE ---------------- */
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

/* ---------------- MULTILEVEL INHERITANCE ---------------- */
class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping");
    }
}

/* ---------------- HIERARCHICAL INHERITANCE ---------------- */
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

/* ---------------- HYBRID INHERITANCE ---------------- */
// Combination of inheritance types using interface

interface Phone {
    void call();
}

interface Camera {
    void camera();
}

class BasicPhone implements Phone {
    public void call() {
        System.out.println("Calling feature");
    }
}

class SmartPhone extends BasicPhone implements Camera {

    public void camera() {
        System.out.println("Camera feature");
    }

    void internet() {
        System.out.println("Internet feature");
    }
}