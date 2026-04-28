public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("----- METHOD OVERLOADING -----");
        Test t = new Test();
        t.show();
        t.show(10);
        t.show("Java");

        System.out.println("\n----- METHOD OVERRIDING -----");
        Parent p = new Child();
        p.display();

        System.out.println("\n----- VARIABLE SHADOWING -----");
        Child c = new Child();
        c.printValue();

        System.out.println("\n----- METHOD SHADOWING (Static Methods) -----");
        Parent p1 = new Child();
        p1.staticMethod(); // Parent version called

        System.out.println("\n----- CONSTRUCTOR OVERLOADING -----");
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);
        Demo d3 = new Demo("Hello");
    }
}

/* ---------------- METHOD OVERLOADING ---------------- */
class Test {

    void show() {
        System.out.println("No parameter method");
    }

    void show(int a) {
        System.out.println("Integer method: " + a);
    }

    void show(String s) {
        System.out.println("String method: " + s);
    }
}

/* ---------------- METHOD OVERRIDING ---------------- */
class Parent {
    void display() {
        System.out.println("Parent class method");
    }

    static void staticMethod() {
        System.out.println("Parent static method");
    }

    int value = 100;
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Child class method (Overriding)");
    }

    static void staticMethod() {
        System.out.println("Child static method (Shadowing)");
    }

    int value = 200;

    void printValue() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);
    }
}

/* ---------------- CONSTRUCTOR OVERLOADING ---------------- */
class Demo {

    Demo() {
        System.out.println("Default Constructor");
    }

    Demo(int a) {
        System.out.println("Parameterized Constructor: " + a);
    }

    Demo(String s) {
        System.out.println("String Constructor: " + s);
    }
}