public class Abstraction {

    public static void main(String[] args) {

        // Cannot create object of abstract class
        // Shape s = new Shape(); ❌

        Shape s1 = new Circle();
        s1.draw();

        Shape s2 = new Rectangle();
        s2.draw();
    }
}

/* ---------------- ABSTRACT CLASS ---------------- */
abstract class Shape {

    abstract void draw();   // abstract method (no body)

    void show() {
        System.out.println("This is a normal method in abstract class");
    }
}

/* ---------------- CHILD CLASS 1 ---------------- */
class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

/* ---------------- CHILD CLASS 2 ---------------- */
class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }
}